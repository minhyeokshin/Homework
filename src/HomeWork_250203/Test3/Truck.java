package HomeWork_250203.Test3;

public class Truck extends Wheeler{

    public Truck(String carName,int velocity,int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
    this.velocity += speed * 5;
    if (velocity>=100) velocity=100;
        show();
    }

    @Override
    public void speedDown(int speed) {
        this.velocity -= speed *5;
        if (velocity<=50) {
            velocity = 50;
            System.out.printf("트럭의 최저속도 위반으로 속도를 %d로 올립니다.%n", velocity);
            System.out.println();
        }
        else show();


    }
}
