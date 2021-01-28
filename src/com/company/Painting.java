package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Painting extends Canvas {

    public static final int FRAME_SIZE = 500;


    @Override
    public void paint(Graphics graphics){
        final Circle[] circles = new Circle[7];

        for (int i = 0; i < circles.length; i++){
            circles[i] = Circle.generateRandomCircle();
            circles[i].draw(graphics);
            System.out.printf("Area: %.2f, length: %.2f%n", circles[i].getCircleArea(), circles[i].getCircleLength());
        }

//        circles = new Circle[10];
    }

    public static void main(String[] args) {
        Painting canvas = new Painting();
        JFrame jframe = new JFrame();
        jframe.setSize (FRAME_SIZE, FRAME_SIZE);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().add(canvas);
        jframe.setVisible(true);
    }


}
