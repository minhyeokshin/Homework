package HomeWork_250203.Test3;

public class Prob1 {
    public static void main(String[] args) {
        Truck truck = new Truck("트럭",100,4);
        Bike bike = new Bike("자전거",25,2);
        truck.ShowWheelNumber();
        bike.ShowWheelNumber();
        truck.show();
        bike.show();
        truck.speedDown(10);
        bike.speedDown(15);
        truck.stop();
        bike.stop();
        truck.speedUp(10);
    }
}