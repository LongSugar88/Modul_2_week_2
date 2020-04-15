package compareble_SurtArray;

public class CompareTo extends Circle implements Comparable<CompareTo> {

    CompareTo(){

    }
    CompareTo( double radius){
        super(radius);
    }

    @Override
    public int compareTo(CompareTo circle){
        if(getRadius() > circle.getRadius()){
            double t = getRadius();
            double d = circle.getRadius();
            return 1;
        }
        else if(getRadius() < circle.getRadius()){
            double t = getRadius();
            double d = circle.getRadius();
            return -1;
        }
        else {
            double t = getRadius();
            double d = circle.getRadius();
            return 1;
        }
    }

    public Double getInforgetRadius(){
        return getRadius();
    }

}
