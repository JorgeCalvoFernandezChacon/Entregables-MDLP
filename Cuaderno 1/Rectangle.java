public class Rectangle {
    private float length;
    private float width;

    // Constructor de clase
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    // Getters y Setters
    public float getLength() {
        return length;
    }
    public void setLength(float newLength) {
        length = newLength;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float newWidth) {
        width = newWidth;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
    
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }

}
