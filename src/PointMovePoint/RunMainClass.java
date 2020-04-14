package PointMovePoint;

public class RunMainClass {
    public static void main(String[] args){
        Point point = new Point();
        MoveblePoint movePoint = new MoveblePoint(0,0,10,10);
        System.out.println("Before call move() method");
        System.out.println(movePoint.toString());
        System.out.println("After call move() method");
        System.out.println(movePoint.move().toString());

    }
}
