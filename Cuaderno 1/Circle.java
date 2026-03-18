public class Circle {
    private double radius = 1.0;

    /**
     * Constructor por defecto
     */
    public Circle() {
    }
    /**
     * Constructor given de radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }


}
