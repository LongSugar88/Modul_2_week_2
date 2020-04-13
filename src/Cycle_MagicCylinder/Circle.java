package Cycle_MagicCylinder;

public class Circle {
    private double radius = 3;
    private String color = "violet";
    public Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        double area = Math.pow(radius,2)*Math.PI;
        return area;
    }
    public String toString(){
        return "The Circle class with radius = "+ radius;
    }

}
