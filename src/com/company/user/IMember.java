package com.company.user;

import com.company.Message;

public interface IMember {
    void sendMessage(Message message);
    void receiveMessage(Message message) throws InterruptedException;
}
