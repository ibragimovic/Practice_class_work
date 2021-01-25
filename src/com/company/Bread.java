package com.company;

public class Bread {
    private static int numberOfBread;
    private int test;

    public  Bread(){
        numberOfBread++;
        test++;

    }

    public static int getNumberOfBread(){
        return numberOfBread;
    }

    public int getTest(){
        return test;
    }
}
