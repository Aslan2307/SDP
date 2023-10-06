package strategy;

public class Main2 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("Phone", 99990, 3);
        Product product2 = new Product("Headphone", 276.0, 5);

        cart.addProduct(product1);
        cart.addProduct(product2);

        PaymentStrategy creditCardPayment = new VisaCardPaymentStrategy();
        PaymentStrategy payPalPayment = new QiWiPaymentStrategy();
        PaymentStrategy bitcoinPayment = new CashPaymentStrategy();
        cart.checkout(bitcoinPayment);
        cart.checkout(creditCardPayment);
        cart.checkout(payPalPayment);
    }

}