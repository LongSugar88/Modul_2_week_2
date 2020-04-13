package PointClass;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(){

    }
    public Point2D( float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return  y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY( float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float xy[] = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }
    public String toString(){
        return "Location of point in 2D scale is (" + getXY()[0] +","+ getXY()[1]+")";
    }
}
