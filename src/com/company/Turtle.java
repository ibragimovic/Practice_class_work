package com.company;

public class Turtle implements Turtlable{

//    @Override
//    public void swim() {
//        System.out.println("Turtle is swimming");
//    }

    @Override
    public void wearShell(){
        System.out.println("Turtle wears shell");
    }

    @Override
    public void putEggs(){
        System.out.println("Turtle put eggs");
    }

    @Override
    public String toString(){
        return "Turtle";
    }
}
