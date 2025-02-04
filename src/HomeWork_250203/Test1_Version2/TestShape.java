package HomeWork_250203.Test1_Version2;


public class TestShape {
    public static void main(String[] args) {
        Shape [] shape = new Shape[2];
        shape[0] = new Circle(10,"원");
        shape[1] = new Rectangular(10,20,"직사각형");

        for(int i = 0;i<shape.length;i++){
            shape[i].calculationArea();
            shape[i].print();
        }

    }
}
