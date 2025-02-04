package HomeWork_250203.Test3;


public class Bike extends Wheeler {
    public Bike(String carName,int velocity,int wheelNumber){
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        this.velocity += speed;
        if (velocity>=40) velocity=40;
        show();
    }

    @Override
    public void speedDown(int speed) {
        this.velocity -= speed;
        if (velocity<=10) {
            velocity = 10;
            System.out.printf("자전거의 최저속도 위반으로 속도를 %d로 올립니다.%n", velocity);
            System.out.println();
        }
        else show();


    }
}
