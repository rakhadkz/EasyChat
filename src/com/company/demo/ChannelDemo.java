package com.company.demo;

import com.company.Message;
import com.company.channel.Channel;
import com.company.channel.Subscriber;
import com.company.user.ChannelAdmin;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ChannelDemo {
    public static void main(String[] args) throws InterruptedException {
        Message m1 = new Message("Over the past day, 183 people were infected with the coronavirus in Kazakhstan.", new Date());
        TimeUnit.SECONDS.sleep(10);
        Message m2 = new Message("Press Secretary of the President of the Republic of Kazakhstan got coronavirus infection", new Date());
        TimeUnit.SECONDS.sleep(10);

        Channel KZnews = new Channel();

        Subscriber subscriber1 = new Subscriber(KZnews,"Umit");
        Subscriber subscriber2 = new Subscriber(KZnews, "Beigut");
        Subscriber subscriber3 = new Subscriber(KZnews, "Shyngys");

        ChannelAdmin user1 = new ChannelAdmin(KZnews);
        user1.sendMessage(m1);
        System.out.println("-----------------------------");
        KZnews.removeSubscriber(subscriber1);
        user1.sendMessage(m2);
    }
}
