package org.example;

public class Main_Point {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 1.0f, 2.5f, 0.5f);
        System.out.println("Antes de mover: " + mp);
        mp.move();
        System.out.println("Después de 1 movimiento: " + mp);
        mp.move().move();
        System.out.println("Después de 2 movimientos más: " + mp);
    }
}
