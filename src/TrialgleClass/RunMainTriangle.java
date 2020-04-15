package TrialgleClass;

public class RunMainTriangle {
    public static void main(String[] args){
        Triangle triangle = new Triangle(3,4,5);
        Shape shape = new Triangle(4,5,6);
        System.out.println(triangle.toString());
        triangle.getArea();
        triangle.getPerimeter();
    }
}
