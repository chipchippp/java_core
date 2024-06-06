package Example.Interface_1;

public class CreditCardPayment implements Payment{
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by credit card." + " Card number: " + cardNumber + " Card holder name: " + cardHolderName);
    }
}
