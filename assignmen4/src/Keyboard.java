// Concrete Products (Keyboard, Mouse, Monitor, Printer)
class Keyboard implements Peripheral {
    private String model;
    private double price;

    public Keyboard(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

