package com.company.demo;

import com.company.Database;
import com.company.Message;
import com.company.chat.AnonymousChat;
import com.company.user.Member;

import java.sql.SQLException;
import java.util.ArrayList;

public class AnonymousChatDemo {
    public static void main(String[] args) {
        try{
            //Connect to database
            Database.connect();

            //Sign in process
            Member user3 = Member.getMember("rakhadkz", "123");
            Member user4 = Member.getMember("arman", "123");
            System.out.println("----");

            //To store all messages and set the mediator to two users
            //TODO store messages from db
            ArrayList<Message> messages1 = new ArrayList<>();
            AnonymousChat anonymousChat = new AnonymousChat(messages1, user3, user4);

            //method sendMessage();
            user3.sendMessage(new Message("Hi"));
            user3.sendMessage(new Message("How are you, bro?"));

            anonymousChat.getChatHistory();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}