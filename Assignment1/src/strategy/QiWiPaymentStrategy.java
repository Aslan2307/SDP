package strategy;

public class QiWiPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " QiWi.");
    }
}