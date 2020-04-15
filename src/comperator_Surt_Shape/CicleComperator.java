package comperator_Surt_Shape;

import java.util.Comparator;

public class CicleComperator implements Comparator<Circle> {

    @Override
    public int compare(Circle circle1,Circle circle2){
        if(circle1.getRadius() > circle2.getRadius()){
            int t = circle1.getRadius();
            int d = circle2.getRadius();

            return 1;
        }
        else if(circle1.getRadius() < circle2.getRadius()){
            int t = circle1.getRadius();
            int d = circle2.getRadius();
            return -1;
        }
        else {
            int t = circle1.getRadius();
            int d = circle2.getRadius();
            return 0;
        }
    }
}
