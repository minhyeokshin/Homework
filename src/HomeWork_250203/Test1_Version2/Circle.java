package HomeWork_250203.Test1_Version2;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    public Circle(double radius, String name){
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        double result = this.radius * this.radius * Math.PI;
        area = result;
    }
}
