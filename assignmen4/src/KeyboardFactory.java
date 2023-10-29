// Concrete Factories (KeyboardFactory, MouseFactory, MonitorFactory, PrinterFactory)
class KeyboardFactory implements PeripheralFactory {
    public Peripheral createPeripheral() {
        return new Keyboard("Logitech K780", 49.99);
    }
}
