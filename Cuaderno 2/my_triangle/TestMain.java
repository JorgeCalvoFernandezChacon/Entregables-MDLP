package es.uah.matcomp.mp.e1.ejerciciosComposicion.my_triangle;

import es.uah.matcomp.mp.e1.ejerciciosComposicion.my_point.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        // Prueba 1: Triángulo escaleno (usando coordenadas)
        MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 0, 3);
        System.out.println(t1);
        System.out.printf("Perímetro: %.2f%n", t1.getPerimeter());
        System.out.println("Tipo: " + t1.getType());

        // Prueba 2: Triángulo isósceles (usando objetos MyPoint)
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, 4);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);

        System.out.println("\n" + t2);
        System.out.printf("Perímetro: %.2f%n", t2.getPerimeter());
        System.out.println("Tipo: " + t2.getType());

        // Prueba 3: Forzar un Equilátero (aproximado por coordenadas)
        // Nota: En coordenadas enteras es imposible un equilátero perfecto,
        // pero podemos probar la lógica.
        MyTriangle t3 = new MyTriangle(0, 0, 10, 0, 5, 8);
        System.out.println("\n" + t3);
        System.out.println("Tipo: " + t3.getType());
    }
}
