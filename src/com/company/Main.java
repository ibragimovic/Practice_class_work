package com.company;

import com.company.boards.AbstractBoard;
import com.company.boards.BlackBoard;
import com.company.boards.WhiteBoard;
import com.company.boards.Writable;
import com.company.monkey.Monkey;

public class Main {

    public static void main(String[] args) {

//
//        Turtle turtle = new Turtle();
//        turtle.swim();
//        turtle.wearShell();
//        turtle.putEggs();


        Swimmable turtle1 = new Turtle();
        Turtlable turtlable = new Turtle();

        Conteiner conteiner = new Conteiner();
        conteiner.setSwimmable(turtle1);
        conteiner.setPutEggs(new Chicken());
        conteiner.print();

        turtle1.swim();

        System.out.println("Is swimming? " + (Swimmable.IS_SWIMMING ? "Yes" : "No"));
        System.out.println("Max ocean depth: " + Swimmable.MAX_OCEAN_DEPTH);
    }
}

