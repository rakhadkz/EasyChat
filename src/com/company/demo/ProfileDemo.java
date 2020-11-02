package com.company.demo;

import com.company.Database;
import com.company.user.Member;

import java.sql.SQLException;

public class ProfileDemo {
    public static void main(String[] args) {
        try{
            //Connect to database
            Database.connect();

            //Sign in process
            Member user1 = Member.getMember("rakhadkz", "123");
            System.out.println("Outdated data: " + user1.getFirstName());
            System.out.println("Updating first name");
            user1.updateFirstName("Chingis");
            System.out.println("Updated data: " + user1.getFirstName());

            //Also user can update last name, password, username and etc

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
