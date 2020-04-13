package ShapeCircleRectangleSquareInheritance;

public class Square extends Rectangle {
    public Square(){

    }
    public Square( double side){
        super(side ,side);
    }
    public  Square(double side, String color, boolean fill){
        super(side, side, color, fill);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength((side));
    }

//    @Override
//    public void setWidth(double side){
//        setLength(side);
//    }
//    @Override
//    public final void setLength(double side){
//        setLength((side));
//    }
    @Override
    public String toString(){
        return "A square with side = "+ getSide() + " which subclass of "+ super.toString();
    }
}
