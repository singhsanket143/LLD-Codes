package StrategyPattern;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCreditCard {
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;
    
    private RefundStrategy refundStrategy;

    public VisaCreditCard() {
        this.refundStrategy = new BankAccountRefundStrategy();
    }

    // Getters and Setters

    @Override
    public void swipeAndPay() {
        System.out.println("Visa Credit Card swipeAndPay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa Credit Card tapAndPay");
    }

    @Override
    public void doRefund() {
        this.refundStrategy.doRefund();
    }
    
}
