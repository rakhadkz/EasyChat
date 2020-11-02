package com.company.chat;


import com.company.mediator.ChatMediatorImpl;

import java.util.ArrayList;

public class SecretChat extends IndividualChat{
    private long seconds;
    public SecretChat(long seconds) {
        super(new ArrayList<>());
        mediator = new ChatMediatorImpl(this);
        mediator.setSeconds(seconds);
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    private void destroyMessage(){

    }
}
