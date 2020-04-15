package interfaceToCompareShape;

import java.util.Comparator;

public class RectangleComperator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle rectangle1, Rectangle rectangle2){
        int area1 = (int) rectangle1.getArea();
        int area2 = (int) rectangle2.getArea();
        if(area1 > area2) {
            return 1;
        }
        else if( area1 < area2){
            return -1;
        }
        else {
            return 0;
        }
    }
}
