package comperator_Surt_Shape;

public class Rectangle {
    private double width = 1;
    private double length = 1;

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        double area = width*length;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*(width + length);
        return perimeter;
    }
}
