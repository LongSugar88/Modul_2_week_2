package interfaceToCompareShape;

import java.util.Arrays;
import java.util.Comparator;

public class MainTest {
    public static void main(String[] args) {
        Circle circleList[] = new Circle[3];
        circleList[0] = new Circle(5);
        circleList[1] = new Circle(7);
        circleList[2] = new Circle(4);

        Comparator test = new CicleComperator();
        Arrays.sort(circleList, test);

        for (Circle element: circleList){
            System.out.println(element.getRadius());
        }

        Rectangle rectangleList[] = new Rectangle[3];
        rectangleList[0] = new Rectangle(9.5,4.2);
        rectangleList[1] = new Rectangle(3.8,8.1);
        rectangleList[2] = new Rectangle(6.5,5.4);

        Comparator testRectangle = new RectangleComperator();
        Arrays.sort(rectangleList,testRectangle);

        for (Rectangle element: rectangleList){
            System.out.println(element.getArea());
        }
    }
}
