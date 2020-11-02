package com.company.user;

import com.company.Message;
import com.company.channel.Channel;

import java.util.ArrayList;
import java.util.List;

public class ChannelAdmin extends User{
    private List<Message> messages;
    private Channel newsChannel;

    public ChannelAdmin(Channel newsChannel){
        messages = new ArrayList<Message>();
        this.newsChannel = newsChannel;
    }

    public void sendMessage(Message message) {
        messages.add(message);
        newsChannel.notifySubscribers(message);
    }
}
