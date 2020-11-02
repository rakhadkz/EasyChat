package com.company.filter;

import com.company.emuns.Status;
import com.company.user.User;

import java.util.ArrayList;
import java.util.List;

public class FilterByOffline implements Filter{

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> offlineFriendsList = new ArrayList<>();

        for (User user: myFriendsList){
            if (user.getStatus() == Status.OFFLINE){
                offlineFriendsList.add(user);
            }
        }

        return offlineFriendsList;
    }
}
