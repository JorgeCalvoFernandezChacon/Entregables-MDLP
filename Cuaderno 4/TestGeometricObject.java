public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject s1 = new Circle2(5.5); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        Circle2 c1 = (Circle2) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        // Shape s2 = new Shape(); // Se produce error porque la clase shape es abstracta y no se puede instanciar
        GeometricObject s3 = new Rectangle2(1.0, 2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        // System.out.println(s3.getLength()); // No pertenece a shape
        Rectangle2 r1 = (Rectangle2) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());

    }
}
