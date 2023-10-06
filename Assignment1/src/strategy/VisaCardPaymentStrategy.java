package strategy;

public class VisaCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " Visa Card.");
    }
}
