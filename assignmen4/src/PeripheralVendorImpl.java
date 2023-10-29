// Concrete Subject (PeripheralVendorImpl)
class PeripheralVendorImpl implements PeripheralVendor {
    private String vendorName;

    public PeripheralVendorImpl(String name) {
        this.vendorName = name;
    }

    public void update(PeripheralOrder order) {
        System.out.println(vendorName + " received an order: " + order.getOrderDetails());
    }
}
