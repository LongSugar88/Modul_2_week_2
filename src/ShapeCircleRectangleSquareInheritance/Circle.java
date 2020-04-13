package ShapeCircleRectangleSquareInheritance;

public class Circle extends Shape {
    private double radius = 1;

    Circle(){

    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle( double radius, String color, boolean fill){
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius( double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = Math.pow(radius, 2)*Math.PI;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*radius*Math.PI;
        return perimeter;
    }
    @Override
    public String toString(){
        return "A circle with radius = "+ radius + " which is subclass of "+ super.toString();
    }

}
