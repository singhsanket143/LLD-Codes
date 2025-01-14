package StrategyPattern;

public class DinersCreditCard extends CreditCard implements RefundCompatibleCreditCard {
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    private RefundStrategy refundStrategy;

    public DinersCreditCard() {
        this.refundStrategy = new WalletRefundStrategy();
    }

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

    @Override
    public void doRefund() {
        this.refundStrategy.doRefund();
    }

}
