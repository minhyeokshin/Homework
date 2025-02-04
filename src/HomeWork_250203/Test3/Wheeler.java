package HomeWork_250203.Test3;

public abstract class Wheeler {
    protected int velocity;
    protected String carName;
    protected int wheelNumber;

    abstract public void speedUp(int speed);

    abstract public void speedDown(int speed);

    public void stop(){
        velocity = 0;
        System.out.println("정지상태로 속도를 0으로 초기화합니다.");
        System.out.println();
    }

    public void show(){
        System.out.printf("%s의 현재 속도는 %d 입니다.%n",this.carName,this.velocity);
        System.out.println();
    }

    public void ShowWheelNumber(){
        System.out.printf("%s : 바퀴 %d 개입니다.%n",this.carName,this.wheelNumber);
        System.out.println();
    }
}
