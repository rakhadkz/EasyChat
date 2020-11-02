package com.company.mediator;

import com.company.Message;
import com.company.chat.Chat;
import com.company.user.Member;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<Member> users;
    private Chat chat;
    private long seconds;
    public ChatMediatorImpl(Chat chat)
    {
        this.chat = chat;
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(Message message, Member user) throws InterruptedException {
        chat.addMessage(message);
        for (Member u: this.users){
            if (u != user){
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(Member user) {
        this.users.add(user);
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }
}
