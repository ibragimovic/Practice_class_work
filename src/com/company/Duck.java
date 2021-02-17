package com.company;

public class Duck implements Swimmable{

    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }

    @Override
    public void makeSound(){
        System.out.println("Quack-quack");
    }
}
