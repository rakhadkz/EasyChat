package com.company.demo;

import com.company.Database;
import com.company.Message;
import com.company.chat.GroupChat;
import com.company.user.Member;

import java.sql.SQLException;
import java.util.ArrayList;

public class GroupChatDemo {
    public static void main(String[] args) {
        try{
            //Database connection
            Database.connect();
            //Identification of members
            Member user1 = Member.getMember("rakhadkz", "123");
            Member user2 = Member.getMember("dauka", "123");
            Member user3 = Member.getMember("steve", "222");
            System.out.println("----");

            //List of members
            ArrayList<Member> list = new ArrayList<>();
            list.add(user1);
            list.add(user2);
            list.add(user3);
            Message message = new Message("HI");

            //Store all message of the group chat
            //TODO store from db
            ArrayList<Message> messages = new ArrayList<>();
            messages.add(message);

            //To create GroupChat class
            GroupChat chat = new GroupChat(messages, list);

            //Notify a message to all members
            user1.sendMessage(new Message("Hello"));
            user1.sendMessage(new Message("How are you, guys?"));

            chat.getChatHistory();


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
