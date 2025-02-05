package HomeWork_250205.ex;

public class Customer extends Cafe{

    public Customer(String name){
        super(name);
    }

    @Override
    public void eat() {
        switch (getName()){
            case "A":
                setMenu("아이스 아메리카노");
                break;
            case "B":
                setMenu("딸기라떼");
                break;
            default:
                System.out.println("고객명을 올바르게 입력해주세요.");
                break;
        }
        System.out.println("단골손님" + this.getName() + "는 " +this.getMenu() + "를 먹는다.");
    }
}
