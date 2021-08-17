package day46_Inheritance.shapeTask;

public class Circle extends Shape {

    private double radius, diameter;
    private final static double PI = 3.14;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
       setDiameter(radius * 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <0){
            return;
        }
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter < 0){
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }



}
