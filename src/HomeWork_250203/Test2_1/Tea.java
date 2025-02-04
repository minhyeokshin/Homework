package HomeWork_250203.Test2_1;

public class Tea extends Beverage {
    public static int amount;

    @Override
    public void calcPrice() {
        switch (getName()){
            case "lemonTea":
                setPrice(1500);
                break;
            case "ginsengTea":
                setPrice(2000);
                break;
            case "redginsengTea":
                setPrice(2500);
                break;
            default:
                setPrice(0);
                break;
        }
    }

    public Tea(String name){
        super(name);
        amount++;
    }
}
