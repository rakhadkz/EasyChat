package com.company.mediator;

import com.company.Message;
import com.company.user.Member;

public interface ChatMediator {
    void sendMessage(Message message, Member user) throws InterruptedException;
    void addUser(Member user);
}
