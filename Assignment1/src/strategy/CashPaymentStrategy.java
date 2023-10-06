package strategy;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " Cash.");
    }
}
