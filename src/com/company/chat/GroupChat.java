package com.company.chat;

import com.company.Message;
import com.company.mediator.ChatMediatorImpl;
import com.company.user.Member;

import java.util.ArrayList;

public class GroupChat extends Chat {

    public GroupChat(ArrayList<Message> messages, ArrayList<Member> users){
        super(messages, users);
        ChatMediatorImpl mediator = new ChatMediatorImpl(this);
        for (Member user: users){
            user.setMediator(mediator);
            mediator.addUser(user);
        }
    }
    public void getChatHistory(){
        for (Message m: getMessages()) {
            System.out.println(m.toString());
        }
    }
}
