package com.company.demo;

import com.company.Database;
import com.company.Message;
import com.company.chat.SecretChat;
import com.company.user.Member;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class SecretChatDemo {
    public static void main(String[] args) {
        try{
            //Connect to database
            Database.connect();

            //Sign in process
            Member user1 = Member.getMember("rakhadkz", "123");
            Member user2 = Member.getMember("arman", "123");
            System.out.println("----");

            SecretChat secretChat = new SecretChat(2);
            secretChat.setUser1(user1);
            secretChat.setUser2(user2);

            //method sendMessage();
            user1.sendMessage(new Message("Hi"));

            //The next message is going to be sent after 3 seconds
            TimeUnit.SECONDS.sleep(3);

            //But before let's check count of messages
            System.out.println(secretChat.getMessages().size());

            user1.sendMessage(new Message("How are you, bro?"));

            System.out.println(secretChat.getMessages().size());

        } catch (ClassNotFoundException | SQLException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
