public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double newSide){
        setLength(newSide);
        setWidth(newSide);
    }
    public void setWidth(double newWidth){
        super.setWidth(newWidth);
    }
    public void setLength(double newLength){
        super.setLength(newLength);
    }
    public String toString(){
        return "Square["+super.toString();
    }
}
