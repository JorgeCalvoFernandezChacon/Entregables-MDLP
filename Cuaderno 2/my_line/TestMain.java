package es.uah.matcomp.mp.e1.ejerciciosComposicion.my_line;

import es.uah.matcomp.mp.e1.ejerciciosComposicion.my_point.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        // Prueba 1: Constructor por coordenadas
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println("Línea 1: " + l1);
        System.out.printf("Longitud l1: %.2f%n", l1.getLength());
        System.out.printf("Gradiente l1 (rad): %.2f%n", l1.getGradient());

        // Prueba 2: Constructor por puntos existentes
        MyPoint pA = new MyPoint(1, 1);
        MyPoint pB = new MyPoint(5, 5);
        MyLine l2 = new MyLine(pA, pB);
        System.out.println("\nLínea 2: " + l2);

        // Probar setters individuales
        l2.setBeginX(10);
        l2.setEndY(10);
        System.out.println("Línea 2 tras modificar puntos: " + l2);
        System.out.printf("Nueva longitud l2: %.2f%n", l2.getLength());

        // Probar getBeginXY
        int[] coords = l2.getBeginXY();
        System.out.println("\nCoordenadas inicio l2: (" + coords[0] + "," + coords[1] + ")");
    }
}
