package interfaceColorAble;

public class MainRun {
    public static void main(String[] args) {
        Shape listShape[] = new Shape[5];
        listShape[0] = new Rectangle(3,5);
        listShape[1] = new Square(8);
        listShape[2] = new Circle(6);
        listShape[3] = new Rectangle(3,5);
        listShape[4] = new Circle(2);

        for (Shape element: listShape
             ) {
            System.out.println(element.getArea());
           if( element instanceof Square) {
               ((Square) element).howToColor();
           }
        }
    }
}
