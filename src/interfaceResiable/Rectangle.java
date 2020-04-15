package interfaceResiable;

public class Rectangle implements Resize{
    private double width = 1;
    private double length = 1;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void resize(double persent){
        System.out.printf("This rectangle was increase size by %.2f persent", persent);
        System.out.println();
        width *= (1+ persent/100);
        length *= (1+ persent/100);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = width * length;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (width + length);
        return perimeter;
    }
}
