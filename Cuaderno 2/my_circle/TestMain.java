package es.uah.matcomp.mp.e1.ejerciciosComposicion.my_circle;

import es.uah.matcomp.mp.e1.ejerciciosComposicion.my_point.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println(c2);

        MyPoint p1 = new MyPoint(10, 10);
        MyCircle c3 = new MyCircle(p1, 2);
        System.out.println(c3);

        c1.setRadius(10);
        c1.setCenterXY(5, 5);
        System.out.println("c1 modificado: " + c1);
        System.out.println("Centro X: " + c1.getCenterX());
        System.out.println("Centro Y: " + c1.getCenterY());

        System.out.printf("Area c1: %.2f%n", c1.getArea());
        System.out.printf("Circunferencia c1: %.2f%n", c1.getCircumference());

        System.out.printf("Distancia entre c1 y c2: %.2f%n", c1.distance(c2));
    }
}
