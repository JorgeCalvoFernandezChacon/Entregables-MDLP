public class MovableTest {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(5, 5, 2, 3);
        System.out.println("Inicial: " + p);
        p.moveUp();
        System.out.println("Después de moveUp: " + p);
        p.moveDown();
        System.out.println("Después de moveDown: " + p);
        p.moveLeft();
        System.out.println("Después de moveLeft: " + p);
        p.moveRight();
        System.out.println("Después de moveRight: " + p);

        MovableCircle c = new MovableCircle(10, 10, 1, 1, 5);
        System.out.println("Inicial: " + c);
        c.moveUp();
        System.out.println("Después de moveUp: " + c);
        c.moveDown();
        System.out.println("Después de moveDown: " + c);
        c.moveLeft();
        System.out.println("Después de moveLeft: " + c);
        c.moveRight();
        System.out.println("Después de moveRight: " + c);
    }
}