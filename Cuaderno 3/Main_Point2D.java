package org.example;

public class Main_Point2D {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(1.2f, 3.4f);
        System.out.println("2D: " + p2);
        Point3D p3 = new Point3D(5.6f, 7.8f, 9.0f);
        System.out.println("3D: " + p3);
        p3.setXYZ(1.0f, 1.0f, 1.0f);
        System.out.println("3D movido: " + p3);
    }
}
