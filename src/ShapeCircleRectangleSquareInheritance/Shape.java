package ShapeCircleRectangleSquareInheritance;

public class Shape {
    private String color = "green";
    private boolean fill = true;

    public Shape() {

    }
    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor(){
        return color;
    }
    public boolean isFill(){
        return fill;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFill(boolean fill){
        this.fill = fill;
    }
    @Override
    public String toString(){
        if(fill){
            return "A shape with color of "+ color+" and filled";
        } else {
            return "A shape with color of "+ color+" and not fill";
        }

    }
}
