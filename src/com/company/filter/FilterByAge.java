package com.company.filter;

import com.company.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterByAge implements Filter {

    @Override
    public List<User> filter(List<User> myFriendsList) {
        List<User> ageFriendsList = new ArrayList<>();

        System.out.println("Choose filtering age type:\n");
        System.out.println("         1. UNDER         \n");
        System.out.println("         2. EQUAL         \n");
        System.out.println("         3. GREATER       \n");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        System.out.println("Enter AGE:");
        int age = in.nextInt();

        for (User user : myFriendsList) {
            switch (choice) {
                case 1: {
                    if (user.getAge() < age) {
                        ageFriendsList.add(user);
                    }
                    break;
                }

                case 2: {
                    if (user.getAge() == age) {
                        ageFriendsList.add(user);
                    }
                    break;
                }

                case 3: {
                    if (user.getAge() > age) {
                        ageFriendsList.add(user);
                    }
                    break;
                }
            }
        }

        return ageFriendsList;
    }
}
