package com.company.channel;

import com.company.Message;

public class Subscriber implements Observer {
    private String name;
    private Subject channel;

    public Subscriber(Subject channel, String name) {
        this.channel = channel;
        channel.registerSubscriber(this);
        this.name = name;
    }

    @Override
    public void update(Message m) {
        System.out.println(this.name + ", you got a new message: " + m.getText());
        System.out.println("Date sent: " + m.getDate());
    }
}
