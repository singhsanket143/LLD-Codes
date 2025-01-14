package Solid.Example6.ProblematicCode;

public class MasterCardCreditCard extends CreditCard {
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    // Getters and Setters

    @Override
    public void swipeAndPay() {
        System.out.println("MasterCard Credit Card swipeAndPay");
    }

    @Override
    public void doRefund() {
        System.out.println("MasterCard Credit Card doRefund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("MasterCard Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("MasterCard Credit Card tapAndPay");
    }

    // @Override
    // public void upiPayment() {
    //     System.out.println("MasterCard Credit Card upiPayment");
    // }

    @Override
    public void intlPayment() {
        System.out.println("Amex Credit Card upiPayment");
    }
    
}
