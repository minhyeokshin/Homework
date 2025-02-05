package HomeWork_250205.interface1;

public class Chicken extends Animal implements Cheatable{

    public String name;

    public Chicken(int speed,String name){super(speed,name);}

    @Override
    public void run() {setDistance(getSpeed());}


    @Override
    public void fly() {setDistance(this.getSpeed() * 2);}
}
