package com.company.filter;

import com.company.emuns.MaritalStatus;
import com.company.user.User;

import java.util.ArrayList;
import java.util.List;

public class FilterByDivorced implements Filter{

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> divorcedFriendsList = new ArrayList<>();

        for (User user: myFriendsList){
            if (user.getMaritalStatus() == MaritalStatus.DIVORCED){
                divorcedFriendsList.add(user);
            }
        }

        return divorcedFriendsList;
    }
}
