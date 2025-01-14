package Solid.Example6.BetterCode;

public class DinersCreditCard extends CreditCard {
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    // Getters and Setters

    @Override
    public void swipeAndPay() {
        System.out.println("Diners Credit Card swipeAndPay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Diners Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Diners Credit Card tapAndPay");
    }

}
