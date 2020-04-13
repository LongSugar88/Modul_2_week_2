package ShapeCircleRectangleSquareInheritance;

public class MainMethod {
    public static void main(String[] args){
//        Shape shape = new Shape("red", true);
//        System.out.println(shape.getColor());
//        System.out.println(shape.isFill());
//        System.out.println(shape.toString());

//        Rectangle rectangle = new Rectangle(10,10,"pink", false);
//        System.out.println(rectangle.getColor());
//        System.out.println(rectangle.toString());

//        Circle circle = new Circle(10);
//        System.out.println(circle.getColor());
//        System.out.println(circle.toString());

        Square square = new Square(15, "violet", true);
        square.setSide(10);
        System.out.println(square.getColor());
        System.out.println(square.toString());

    }
}
