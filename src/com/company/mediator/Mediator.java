package com.company.mediator;

import com.company.Message;
import com.company.user.User;

public interface Mediator {
    void register(User user);
    void deliver(User sender, Message message);
}
