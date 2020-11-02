package com.company;

public class Random {
    public static int generated(){
        java.util.Random rand = new java.util.Random();
        return rand.nextInt(1000);
    }
}
