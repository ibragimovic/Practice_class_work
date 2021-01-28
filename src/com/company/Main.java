package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        final Circle circle = new Circle(5, Color.BLUE, 10, 10);
//        circle = new Circle(); //- Невозможно поменять ссылку
        circle.setRadius(100);//Но объект на которую ссылается ссылка мы поменять можем
        circle.setX(8787);

        final int [] ARRAY = new int[10];
        for (int i = 0; i < ARRAY.length; i++){
            ARRAY[i] = i;
            ARRAY[i] = i + 5;
            System.out.print(ARRAY[i] + " ");
        }
        ARRAY[0] = 100;
//        ARRAY = new int[50];//- Невозможно поменять ссылку







    }
}
