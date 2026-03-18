package org.example;

public class Main_Geometric {
    public static void main(String[] args) {
        GeometricObject geo1 = new Circle(5.5);
        System.out.println(geo1);
        System.out.println(geo1.getArea());
        System.out.println(geo1.getPerimeter());
        Circle c1 = (Circle) geo1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        GeometricObject geo3 = new Rectangle(1.0, 2.0);
        System.out.println(geo3);
        System.out.println(geo3.getArea());
        System.out.println(geo3.getPerimeter());
        Rectangle r1 = (Rectangle) geo3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
