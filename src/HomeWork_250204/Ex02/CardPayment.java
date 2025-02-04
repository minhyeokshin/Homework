package HomeWork_250204.Ex02;

public class CardPayment extends PayMent{
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    public CardPayment(String shopName,String producName,long producPrice,String cardNumber,String cardPassword,int monthlyInstallment){
        super(shopName,producName,producPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    public String toString() {
        return null;
    }

}
