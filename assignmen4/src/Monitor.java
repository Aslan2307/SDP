class Monitor implements Peripheral {
    private String model;
    private double price;

    public Monitor(String model, double price) {
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
