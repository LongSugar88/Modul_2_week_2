package interfaceResiable;


public class Square implements Resize  {
    private double size;

    public Square() {

    }
    public Square(double side) {
        this.size = side;
    }

    @Override
    public void resize(double persent){
        System.out.printf("This rectangle was increase size by %.2f persent", persent);
        System.out.println();
        size *= (1+ persent/100);
    }

    public double getSide() {
        return size;
    }
    public double getArea() {
        double area = size * size;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (size + size);
        return perimeter;
    }

}

