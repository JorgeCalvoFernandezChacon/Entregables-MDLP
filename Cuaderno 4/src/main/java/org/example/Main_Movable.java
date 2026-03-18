package org.example;

public class Main_Movable {
    public static void main(String[] args) {
        MovablePoint miPunto = new MovablePoint(0, 0, 2, 3);
        System.out.println(miPunto);
        miPunto.moveUp();
        System.out.println(miPunto);
        miPunto.moveRight();
        System.out.println(miPunto);
        miPunto.moveDown();
        miPunto.moveLeft();
        System.out.println(miPunto);
    }
}
