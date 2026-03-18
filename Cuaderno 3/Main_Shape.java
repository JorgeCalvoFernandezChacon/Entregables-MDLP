package org.example;

public class Main_Shape {
    public static void main(String[] args) {
        Square sq = new Square(5.0, "blue", false);
        System.out.println(sq);
        System.out.println("Area: " + sq.getArea());
        sq.setSide(10.0);
        System.out.println("Nuevo lado: " + sq.getSide());
        System.out.println(sq);
    }
}
