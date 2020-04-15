package interfaceResiable;

public class Circle implements Resize {
    private double radius;

    Circle( double radius){
        this.radius = radius;
    }

    @Override
    public void resize(double persent){
        System.out.printf("This Circle was increase size by %.2f persent", persent);
        System.out.println();
        radius *= (1+ persent/100);
    }


    public double getRadius(){
        return radius;
    }
    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }
}

