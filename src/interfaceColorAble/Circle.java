package interfaceColorAble;

public class Circle extends Shape {
    private double radius;

    Circle(){

    }
    Circle( double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    @Override
    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }
}
