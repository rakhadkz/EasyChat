package com.company.filter;

import com.company.emuns.Status;
import com.company.user.User;

import java.util.ArrayList;
import java.util.List;

public class FilterByOnline implements Filter{

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> onlineFriendsList = new ArrayList<>();

        for (User user: myFriendsList){
            if (user.getStatus() == Status.ONLINE){
                onlineFriendsList.add(user);
            }
        }

        return onlineFriendsList;
    }
}
