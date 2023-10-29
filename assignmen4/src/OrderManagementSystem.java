import java.util.ArrayList;
import java.util.List;

// Subject (Order Management System)
class OrderManagementSystem {
    private List<PeripheralVendor> vendors = new ArrayList<>();
    private List<PeripheralOrder> orders = new ArrayList<>();

    public void addObserver(PeripheralVendor vendor) {
        vendors.add(vendor);
    }

    public void placeOrder(PeripheralOrder order) {
        orders.add(order);
        notifyVendors(order);
    }

    private void notifyVendors(PeripheralOrder order) {
        for (PeripheralVendor vendor : vendors) {
            vendor.update(order);
        }
    }
}