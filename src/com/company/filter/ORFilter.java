package com.company.filter;

import com.company.user.User;

import java.util.List;

public class ORFilter implements Filter{
    private Filter first;
    private Filter second;

    public ORFilter(Filter first, Filter second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> firstList = first.filter(myFriendsList);
        List<User> secondList = second.filter(myFriendsList);

        for (User user: firstList){
            if(!secondList.contains(user)){
                secondList.add(user);
            }
        }

        return secondList;
    }
}
