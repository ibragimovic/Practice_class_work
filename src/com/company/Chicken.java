package com.company;

public class Chicken implements PutEggs {

    @Override
    public void putEggs(){
        System.out.println("Chicken puts eggs");
    }

    @Override
    public String toString(){
        return "Chicken";
    }
}
