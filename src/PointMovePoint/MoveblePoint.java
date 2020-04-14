package PointMovePoint;

public class MoveblePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MoveblePoint(){

    }
    MoveblePoint( float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveblePoint( float x, float y, float xSpeed, float ySpeed ){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getxSpeed(){
        return xSpeed;
    }
    public float getySpeed(){
        return ySpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setXYSpeed( float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getXYSpeed(){
        float[] XYSpeed = new float[2];
        XYSpeed[0] = xSpeed;
        XYSpeed[1] = ySpeed;
        return XYSpeed;
    }
    public MoveblePoint move(){
        float x = super.getX()+ xSpeed;
        float y = super.getY()+ ySpeed;
        super.setX(x);
        super.setY(y);
        return this;
    }
    @Override
    public String toString(){
        return "New location of point in 2D scale is (" + getXY()[0] +","+ getXY()[1]+")";
    }

}
