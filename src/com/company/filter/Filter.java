package com.company.filter;

import com.company.user.User;

import java.util.List;

public interface Filter {
    public List<User> filter(List<User> myFriendsList);
}
