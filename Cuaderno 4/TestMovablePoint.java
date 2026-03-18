public class TestMovablePoint {
    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Punto inicial: " + p);
        p.moveUp();
        System.out.println("Después de moveUp: " + p);
        p.moveDown();
        System.out.println("Después de moveDown: " + p);
        p.moveRight();
        System.out.println("Después de moveRight: " + p);
        p.moveLeft();
        System.out.println("Después de moveLeft: " + p);
    }
}