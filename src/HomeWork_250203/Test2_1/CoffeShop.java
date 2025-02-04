package HomeWork_250203.Test2_1;

public class CoffeShop {
    public static void main(String[] args) {
        System.out.println("****java nara CoffeeShop영업개시****");
        Beverage[] beverages = new Beverage[5];
        beverages[0] = new Coffee("Cappuccino");
        beverages[1] = new Coffee("CafeLatte");
        beverages[2] = new Tea("ginsengTea");
        beverages[3] = new Coffee("CafeLatte");
        beverages[4] = new Tea("redginsengTea");
        getSalesInfo(beverages);

        System.out.println("총 판매 금액==>"+getTotalPrice(beverages));
        System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"잔");
        System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
    }
    //결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
    public static void getSalesInfo(Beverage[] beverages) {
        for (int i = 0; i < beverages.length; i++) {
            beverages[i].print(i + 1);
        }
    }

    //결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
    public static int getTotalPrice(Beverage[] beverages) {
        int totalPrice = 0;
        for (Beverage beverage : beverages) {
            totalPrice += beverage.getPrice();
        }
        return totalPrice;
    }

    }

