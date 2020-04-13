package Cycle_MagicCylinder;

public class Cylinder extends Circle {
    private double height = 10;
    public Cylinder(){

    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        double volume = super.getArea()*height;
        return volume;
    }
    @Override
    public String toString(){
        return "This is Cylinder class with radius = "+ getRadius()+ " which is subclass of "+ super.toString();
    }
}
