package com.company.user;

import com.company.Database;
import com.company.Message;
import com.company.chat.SecretChat;
import com.company.mediator.ChatMediatorImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Member extends User implements IMember {
    public static Member getMember(String username, String password) throws SQLException {
        if (isCorrect(username, password)){
            String sql1 = "select * from user where username = '" + username + "' and password = '" + password + "'";
            String sql2 = "select * from friends f " +
                    "inner join user u1 on f.user_id_1 = u1.id " +
                    "inner join user u2 on f.user_id_2 = u2.id where u1.username = '" + username + "'";
            Statement statement = Database.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);
            String firstName = "", lastName = "";
            int id = -1;
            ArrayList<String> friends = new ArrayList<>();
            while (resultSet.next()){
                id = resultSet.getInt(1);
                firstName = resultSet.getString("firstName");
                lastName = resultSet.getString("lastName");
            }
            resultSet = statement.executeQuery(sql2);
            while (resultSet.next()){
                friends.add(resultSet.getString(11));
            }
            return new Member(id, username, password, firstName, lastName, friends);
        }else
            return new NullMember();
    }

    public Member(){
        super();
    }

    public Member(String username, String password){
        super(1, username, password, "Shyngys", "Rakhad", new ArrayList<>());
    }

    public Member(int id, String username, String password, String firstName, String lastName, ArrayList<String> friends) {
        super(id, username, password, firstName, lastName, friends);
    }

    public ChatMediatorImpl getMediator() {
        return mediator;
    }

    public void setMediator(ChatMediatorImpl mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(Message message) {
        if (this instanceof NullMember){
            System.out.println("User not found");
            return;
        }
        message.setAuthor(this);
        System.out.println(this.getUsername() + ": sending " + message.toString());
        try {
            mediator.sendMessage(message, this);
        }catch (NullPointerException e){
            System.out.println("Mediator not found");
        }catch (InterruptedException e){
            System.out.println("Problem with timeout");
        }
    }

    @Override
    public void receiveMessage(Message message) throws InterruptedException {
        message.setAuthor(this);
        System.out.println(this.getUsername() + ": received " + message.toString());
        if (mediator.getChat() instanceof SecretChat){
            Message deleted = mediator.getChat().getMessages().get(0);
            TimeUnit.SECONDS.sleep(mediator.getSeconds());
            mediator.getChat().getMessages().remove(0);
            System.out.println(deleted.toString() + " was successfully deleted at" + new Date());
        }
    }
}
