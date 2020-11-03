package com.company.demo;

import com.company.emuns.Gender;
import com.company.emuns.MaritalStatus;
import com.company.emuns.Status;
import com.company.filter.*;
import com.company.user.User;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();

        users.add(new User("Adam","Smith", "Adom", Gender.MALE, 53, MaritalStatus.DIVORCED, Status.OFFLINE));
        users.add(new User("Anne","Marlyn", "Monro", Gender.FEMALE, 75, MaritalStatus.WIDOWED, Status.OFFLINE));
        users.add(new User("Sam","David", "1LoveSally", Gender.MALE, 27, MaritalStatus.MARRIED, Status.ONLINE));
        users.add(new User("Sally","David", "1LoveSam", Gender.FEMALE, 25, MaritalStatus.MARRIED, Status.ONLINE));

        Filter male = new FilterByMale();
        Filter female = new FilterByFemale();
        Filter single = new FilterBySingle();
        Filter married = new FilterByMarried();
        Filter divorced = new FilterByDivorced();
        Filter widowed = new FilterByWidowed();
        Filter online = new FilterByOnline();
        Filter offline = new FilterByOffline();
        Filter marriedMale = new ANDFilter(male, married);
        Filter divorcedMale = new ANDFilter(male, divorced);
        Filter widowedFemale = new ANDFilter(female, widowed);
        Filter singleORFemale = new ORFilter(single, female);
        Filter divorcedMaleORWidowedFemale = new ORFilter(divorcedMale, widowedFemale);
        Filter all = new ORFilter(online, offline);
        Filter age = new FilterByAge();

        System.out.println("=============MALES=============");
        printUsers(male.filter(users));

        System.out.println("\n=============FEMALES=============");
        printUsers(female.filter(users));

        System.out.println("\n=============MARRIED MALES=============");
        printUsers(marriedMale.filter(users));

        System.out.println("\n=============SINGLE OR FEMALES=============");
        printUsers(singleORFemale.filter(users));

        System.out.println("\n=============DivorcedMales Or WidowedFemales=============");
        printUsers(divorcedMaleORWidowedFemale.filter(users));

        System.out.println("\n=============ALL============= ");
        printUsers(all.filter(users));

        System.out.println("\n=============AGE=============");
        printUsers(age.filter(users));
    }

    public static void printUsers(List<User> users){
        for (User user : users) {
            System.out.println("User : " + user.getName() + user.getSurname() + " (" + user.getUsername() + ")" + "\n" +
                    "Gender : " + user.getGender() + "| Age : " + user.getAge() + "| Marital Status : " + user.getMaritalStatus() + "\n" +
                    "Status" + user.getStatus() + ".\n");
        }
    }
}
