package com.company.filter;

import com.company.emuns.Gender;
import com.company.user.User;

import java.util.ArrayList;
import java.util.List;

public class FilterByMale implements Filter{

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> maleFriendsList = new ArrayList<>();

        for (User user: myFriendsList){
            if (user.getGender() == Gender.MALE){
                maleFriendsList.add(user);
            }
        }

        return maleFriendsList;
    }
}