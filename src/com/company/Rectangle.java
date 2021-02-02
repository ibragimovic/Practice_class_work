package com.company;

import java.awt.*;

public final class Rectangle extends Shape{
    private int height;
    private int width;
    private static int COUNT;

    public Rectangle(Coordinates coordinates, Color color, boolean isVisible, int height, int width) {
        super(coordinates, color, isVisible);
        this.height = height;
        this.width = width;
        COUNT++;
    }

    public Rectangle(Coordinates coordinates, Color color, boolean isVisible, int side){
        super(coordinates, color, isVisible);
        this.height = side;
        this.width = side;
        COUNT++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String speak() {
        String result = super.speak();
        if (height == width) result += "\nSide: " + height;
        else result +=  ",\nHeight: " + height + "\nWidth: " + width;
        return result;
    }

    public static int getCOUNT() {
        return COUNT;
    }

    public void draw(Graphics graphics){
        graphics.setColor(getColor());
        graphics.fillRect(getCoordinates().getX(),
                getCoordinates().getY(), height,width);
    }
}
