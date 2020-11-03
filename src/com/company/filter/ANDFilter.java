package com.company.filter;

import com.company.user.User;

import java.util.List;

public class ANDFilter implements Filter {
    //TODO Filter
    private Filter first;
    private Filter second;

    public ANDFilter(Filter first, Filter second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> firstList = first.filter(myFriendsList);
        List<User> secondList = second.filter(firstList);
        return secondList;
    }
}
