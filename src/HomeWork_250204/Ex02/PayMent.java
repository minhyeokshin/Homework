package HomeWork_250204.Ex02;

public abstract class PayMent {
    protected String shopName;
    protected String productName;
    protected long productPrice;

    public PayMent(String shopName,String productName,long productPrice){
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

}
