package Solid.Example6.ProblematicCode;

public class RupayCreditCard extends CreditCard {
    
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
    public void doRefund() {
        System.out.println("Rupay Credit Card doRefund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay Credit Card tapAndPay");
    }

    // @Override
    public void upiPayment() {
        System.out.println("Rupay Credit Card upiPayment");
    }

    @Override
    public void intlPayment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
