class PrinterFactory implements PeripheralFactory {
    public Peripheral createPeripheral() {
        return new Printer("Epson EcoTank ET-2750", 299.99);
    }
}
