// Concrete Observer (PeripheralOrder)
class PeripheralOrder {
    private String product;
    private int quantity;

    public PeripheralOrder(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getOrderDetails() {
        return "Product: " + product + ", Quantity: " + quantity;
    }
}
