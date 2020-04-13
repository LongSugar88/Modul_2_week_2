package Cycle_MagicCylinder;

public class RunMainClass {
    public static void main(String[] args){
        Circle cylinder = new Cylinder(15, 20,"white");
        Circle  circle= new Circle(7, "yellow");
        System.out.println(cylinder.toString());
        System.out.println(circle.toString());
//        System.out.println(cylinder.getVolume());
    }
}
