package com.company;

import java.awt.*;
import java.util.Random;

public class Circle {

    private double radius;
    private Color color;
    private  int x;
    private int y;
    private static Color[] colors = {Color.PINK, Color.GREEN, Color.BLUE, Color.RED, Color.YELLOW};


    public Circle() {}

    public Circle(double radius, Color color, int x, int y) {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getCircleArea(){
        return Math.PI * getRadius() * getRadius();
    }

    public double getCircleLength(){
        return 2 * Math.PI * getRadius();
    }

    public void draw(Graphics graphics){
        graphics.setColor(getColor());
        graphics.fillOval(getX(), getY(), (int)getRadius()*2, (int)getRadius() * 2);
    }

    public static Circle generateRandomCircle(){
        Random rand = new Random();
        int randomRadius = rand.nextInt(100);
        Color randomColor = colors [rand.nextInt(colors.length)];
        int randomX = rand.nextInt(Painting.FRAME_SIZE);
        int randomY = rand.nextInt(Painting.FRAME_SIZE);
        return new Circle(randomRadius, randomColor, randomX, randomY);
    }
}
