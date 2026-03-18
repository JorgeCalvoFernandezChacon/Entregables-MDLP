package org.example;

public class Main_Resizable {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(100.0);
        System.out.println(rc);
        System.out.println(rc.getArea());
        rc.resize(50);
        System.out.println(rc);
        System.out.println(rc.getArea());
    }
}
