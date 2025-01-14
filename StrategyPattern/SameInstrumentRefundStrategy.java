package StrategyPattern;

public class SameInstrumentRefundStrategy implements RefundStrategy {
    
    @Override
    public void doRefund() {
        System.out.println("Refund initiated to the same instrument");
    }
    
}
