package com.company.filter;

import com.company.emuns.MaritalStatus;
import com.company.user.User;

import java.util.ArrayList;
import java.util.List;

public class FilterBySingle implements Filter{

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> singleFriendsList = new ArrayList<>();

        for (User user: myFriendsList){
            if (user.getMaritalStatus() == MaritalStatus.SINGLE){
                singleFriendsList.add(user);
            }
        }

        return singleFriendsList;
    }
}
