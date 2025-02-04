package HomeWork_250203.Test1_Version2;

public class Rectangular extends Shape{
    private double width;
    private double hight;

    public Rectangular(double width,double hight,String name){
        super(name);
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {return width;}

    public void setWidth(double width) {this.width = width;}

    public double getHight() {return hight;}

    public void setHight(double hight) {this.hight = hight;}


    @Override
    public void calculationArea() {
        double result = this.width * this.hight;
        area = result;
    }
}
