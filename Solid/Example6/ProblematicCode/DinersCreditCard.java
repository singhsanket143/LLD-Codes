package Solid.Example6.ProblematicCode;

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
    public void doRefund() {
        System.out.println("Diners Credit Card doRefund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Diners Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Diners Credit Card tapAndPay");
    }

    // @Override
    // public void upiPayment() {
    //     System.out.println("Diners Credit Card upiPayment");
    // }

    @Override
    public void intlPayment() {
        System.out.println("Diners Credit Card upiPayment");
    }
    
}
