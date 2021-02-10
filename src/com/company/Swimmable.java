package com.company;

public interface Swimmable {

    boolean IS_SWIMMING = true;
    int MAX_OCEAN_DEPTH = 11000;

    default void swim(){
        System.out.println("Swimming");
    }

}
