package Solid.Example6.BetterCode;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCreditCard, RefundCompatibleCreditCard {
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    // Getters and Setters

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay Credit Card swipeAndPay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay Credit Card tapAndPay");
    }

    @Override
    public void upiPayment() {
        System.out.println("Rupay Credit Card upiPayment");
    }

    @Override
    public void doRefund() {
        System.out.println("Rupay Credit Card doRefund");
    }
    
}
