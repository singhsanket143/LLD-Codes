package StrategyPattern;

public class BankAccountRefundStrategy implements RefundStrategy {
    
    @Override
    public void doRefund() {
        System.out.println("Refund initiated to the bank account");
    }
}
