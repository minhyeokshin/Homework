package HomeWork_250203.Test2_2;

public abstract class Content {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Content(){}
    public Content(String title){
        this.title = title;
    }

    public abstract void totalPrice();

    public void show(){
        System.out.printf("%s 비디오의 가격은 %d원입니다.%n",this.getTitle(),this.getPrice());
    }



}
