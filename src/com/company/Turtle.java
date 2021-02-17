package com.company;

public class Turtle implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Turtle is swimming");
    }

    @Override
    public void makeSound(){
        System.out.println("Hissing");
    }

    public void layEggs(int eggsNumber){
        System.out.println("Turtle is laying " + eggsNumber + " eggs");
    }
}
