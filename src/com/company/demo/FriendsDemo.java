package com.company.demo;

import com.company.Database;
import com.company.user.Member;

import java.sql.SQLException;
import java.util.ArrayList;

public class FriendsDemo {
    public static void main(String[] args) {
        try{
            //Connect to database
            Database.connect();

            //Sign in process
            Member user1 = Member.getMember("arman", "123");
            Member user2 = Member.getMember("rakhadkz", "123");
            System.out.println("----");
            System.out.println("Adding a new friend");
            user1.addFriend(user2);
            System.out.println("----");
            System.out.println("Friends of " + user1.getUsername() + " the following:");
            ArrayList<String> friends = user1.getFriends();
            for (String friend : friends) {
                System.out.println(friend);
            }

            // To delete friend call the method object1.deleteFriend(object2); of the class User
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
