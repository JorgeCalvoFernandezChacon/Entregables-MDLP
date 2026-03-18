package es.uah.matcomp.mp.e1.ejerciciosComposicion.my_point;

public class TestMain {
    public static void main(String[] args) {
        // --- PARTE 1: Pruebas básicas del diagrama ---
        MyPoint p1 = new MyPoint();  // Test constructor por defecto
        System.out.println("p1 inicial: " + p1); // Test toString()

        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());

        p1.setXY(3, 0); // Test setXY()
        System.out.println("getXY[0]: " + p1.getXY()[0]); // Test getXY()
        System.out.println("getXY[1]: " + p1.getXY()[1]);
        System.out.println("p1 reconfigurado: " + p1);

        MyPoint p2 = new MyPoint(0, 4); // Test constructor sobrecargado
        System.out.println("p2: " + p2);

        // --- PARTE 2: Distancia métodos sobrecargados ---
        // 1. Usa la versión: distance(MyPoint another)
        System.out.println("Distancia p1 a p2: " + p1.distance(p2));

        // 2. Usa la versión: distance(MyPoint another)
        System.out.println("Distancia p2 a p1: " + p2.distance(p1));

        // 3. Usa la versión: distance(int x, int y)
        System.out.println("Distancia p1 a (5,6): " + p1.distance(5, 6));

        // 4. Usa la versión: distance() (al origen)
        System.out.println("Distancia p1 al origen: " + p1.distance());

        // --- PARTE 3: Array de 10 puntos y Matriz de distancias ---
        System.out.println("\n--- Matriz de Distancias (10x10) ---");
        MyPoint[] points = new MyPoint[10];

        // Inicializar puntos: (1,1), (2,2)... (10,10)
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Mostrar matriz de distancias
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                // Calculamos la distancia entre el punto i y el punto j
                double d = points[i].distance(points[j]);
                System.out.printf("%6.2f ", d);
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }
    }
}
