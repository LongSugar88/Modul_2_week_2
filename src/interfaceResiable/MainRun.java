package interfaceResiable;

public class MainRun {
    public static void main(String[] args) {
        Circle listCircle[] = new Circle[3];
        listCircle[0] = new Circle(2);
        listCircle[1] = new Circle(3);
        listCircle[2] = new Circle(4);

        System.out.println("Array before increase size: ");
        for (Circle element: listCircle
             ) {
            System.out.printf("New area: %.2f ",element.getArea());
            System.out.println();
        }

        System.out.println("Array after increase size: ");
        for (Circle element: listCircle
             ) {
            element.resize(Math.random()*100);
            System.out.printf("New area: %.2f ",element.getArea());
            System.out.println();
        }


        Rectangle listRectangle[] = new Rectangle[3];
        listRectangle[0] = new Rectangle(2,4);
        listRectangle[1] = new Rectangle(3,5);
        listRectangle[2] = new Rectangle(4,8);

        System.out.println("Array before increase size: ");
        for (Rectangle element: listRectangle
        ) {
            System.out.printf("New area: %.2f ",element.getArea());
            System.out.println();
        }

        System.out.println("Array after increase size: ");
        for (Rectangle element: listRectangle
        ) {
            element.resize(Math.random()*100);
            System.out.printf("New area: %.2f ",element.getArea());
            System.out.println();
        }


        Square listSquare[] = new Square[3];
        listSquare[0] = new Square(2);
        listSquare[1] = new Square(3);
        listSquare[2] = new Square(4);

        System.out.println("Array before increase size: ");
        for (Square element:  listSquare
        ) {
            System.out.printf("New area: %.2f ",element.getArea());
            System.out.println();
        }

        System.out.println("Array after increase size: ");
        for (Square element:  listSquare
        ) {
            element.resize(Math.random()*100);
            System.out.printf("New area: %.2f ",element.getArea());
            System.out.println();
        }

    }
}
