public class TestCircle {
    public static void main(String[] args) {
        Circle3 c1 = new Circle3(5.0);
        System.out.println("Objeto: " + c1);
        System.out.println("Área: " + c1.getArea());
        System.out.println("Perímetro: " + c1.getPerimeter());

        ResizableCircle rc = new ResizableCircle(10.0);
        System.out.println("Inicial: " + rc);
        System.out.println("Área inicial: " + rc.getArea());
        System.out.println("Perímetro inicial: " + rc.getPerimeter());

        rc.resize(50);
        System.out.println("\nDespués de resize(50):");
        System.out.println("Objeto: " + rc);
        System.out.println("Área: " + rc.getArea());
        System.out.println("Perímetro: " + rc.getPerimeter());

        rc.resize(200);
        System.out.println("\nDespués de resize(200):");
        System.out.println("Objeto: " + rc);
        System.out.println("Área: " + rc.getArea());
        System.out.println("Perímetro: " + rc.getPerimeter());
    }
}