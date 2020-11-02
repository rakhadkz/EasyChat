package com.company.channel;

import com.company.Message;

public interface Subject {
    void registerSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifySubscribers(Message m);
}
