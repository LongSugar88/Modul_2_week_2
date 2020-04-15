package interfaceColorAble;

public class Square extends Shape implements colorAble {
    private double size;

    public Square() {

    }
    public Square(double side) {
        this.size = side;
    }

    public double getSide() {
        return size;
    }

    @Override
    public double getArea() {
        double area = size * size;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (size + size);
        return perimeter;
    }

    @Override
    public void howToColor(){
        System.out.println("Fill full 4 sides");
    }
}
