package com.company;

import java.awt.*;

public class Shape {
    private Coordinates coordinates;
    private Color color;
    private boolean isVisible;

    public Shape(Coordinates coordinates, Color color, boolean isVisible) {
        this.coordinates = coordinates;
        this.color = color;
        this.isVisible = isVisible;
    }

    public String speak() {
        return coordinates.speak() +
        "\nColor: " + color +
        "\nIs visible: " + isVisible;

    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
