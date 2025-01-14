package Solid.Example6.BetterCode;

public class MasterCreditCard extends CreditCard implements RefundCompatibleCreditCard {
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    // Getters and Setters

    @Override
    public void swipeAndPay() {
        System.out.println("Master Credit Card swipeAndPay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Master Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Master Credit Card tapAndPay");
    }

    @Override
    public void doRefund() {
        System.out.println("Master Credit Card doRefund");
    }
    
    
}
