package HomeWork_250205.interface1;

public class Dog extends Animal{



    public Dog(int speed,String name){super(speed,name);}

    @Override
    public void run() {setDistance(0.5 * getSpeed());}
}
