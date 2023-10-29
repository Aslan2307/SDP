class MouseFactory implements PeripheralFactory {
    public Peripheral createPeripheral() {
        return new Mouse("Logitech MX Master 3", 79.99);
    }
}