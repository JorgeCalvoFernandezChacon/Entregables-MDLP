package org.example;

public class Main_MovableCircle {
    public static void main(String[] args) {
        MovableCircle miCirculo = new MovableCircle(0, 0, 2, 3, 5);
        System.out.println(miCirculo);
        miCirculo.moveUp();
        System.out.println(miCirculo);
        miCirculo.moveRight();
        System.out.println(miCirculo);
    }
}
