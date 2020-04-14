package TrialgleClass;

public class Triangle extends Shape {
    private double side1 = 1, side2 = 1, side3 = 1;
    Triangle(){
    }
    Triangle( double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        checkCondition();
    }
    public boolean checkCondition(){
        boolean check = side1+side2>side3 && side1+side3>side2 && side2+side3>side1;
        return check;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public void setSide2( double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }

    public void getPerimeter() {
        double perimeter;
        perimeter = side1 + side2 + side3;
        if(checkCondition()){
            System.out.printf("Perimeter of triangle is: %.2f ", perimeter);
            System.out.println();
        } else{
            System.out.printf("Triangle not available");
            System.out.println();
        }
    }
    public void getArea(){
        final double PERIMETER = 0.5*(side1 + side2 + side3);
        final double MATH = PERIMETER*(PERIMETER-side1)*(PERIMETER-side2)*(PERIMETER-side3);
        double area = Math.pow(MATH,0.5);
        if(checkCondition()){
            System.out.printf("Area of triangle is: %.2f ", area);
            System.out.println();
        } else{
            System.out.printf("Triangle not available");
            System.out.println();
        }
    }
    @Override
    public String toString(){
        if(checkCondition()){
            return "A triangle which is subclass of "+ super.toString();
        } else{
            return "Triangle not available";
        }

    }

}
