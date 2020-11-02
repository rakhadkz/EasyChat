package com.company.chat;

import com.company.Message;
import com.company.mediator.ChatMediatorImpl;
import com.company.user.Member;

import java.util.ArrayList;

public class IndividualChat extends Chat {
    private Member user1;
    private Member user2;
    ChatMediatorImpl mediator;
    public IndividualChat(ArrayList<Message> messages){
        super(messages);
        mediator = new ChatMediatorImpl(this);
    }

    public IndividualChat(ArrayList<Message> messages, Member user1, Member user2){
        super(messages);
        this.user1 = user1;
        this.user2 = user2;
        this.mediator = new ChatMediatorImpl(this);

        this.user1.setMediator(mediator);
        this.user2.setMediator(mediator);
        mediator.addUser(this.user1);
        mediator.addUser(this.user2);
    }

    public Member getUser1() {
        return user1;
    }

    public void setUser1(Member user1) {
        this.user1 = user1;
        this.user1.setMediator(mediator);
        mediator.addUser(this.user1);

    }

    public Member getUser2() {
        return user2;
    }

    public void setUser2(Member user2) {
        this.user2 = user2;
        this.user2.setMediator(mediator);
        mediator.addUser(this.user2);
    }

    public void getChatHistory(){
        for (Message m: getMessages()) {
            System.out.println(m.toString());
        }
    }
}
