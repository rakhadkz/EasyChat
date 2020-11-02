package com.company.filter;

import com.company.emuns.Gender;
import com.company.user.User;

import java.util.ArrayList;
import java.util.List;

public class FilterByFemale implements Filter{

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> femaleFriendsList = new ArrayList<>();

        for (User user: myFriendsList){
            if (user.getGender() == Gender.FEMALE){
                femaleFriendsList.add(user);
            }
        }

        return femaleFriendsList;
    }
}
