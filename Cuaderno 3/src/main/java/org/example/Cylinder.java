package org.example;

public class Cylinder {
    private Circle2 base;
    private double height;
    public Cylinder(double radius, String color, double height) {
        this.base = new Circle2(radius, color);
        this.height = height;
    }
}
