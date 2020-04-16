package CleanCodeMethod;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double volume;
        double baseArea = getArea(radius);
        double perimeter = getPerimeter(radius);
        volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    public static double getPerimeter(int radius){
        double perimeter;
        perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }
    public static double getArea(int radius){
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
}
