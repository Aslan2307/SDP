class MonitorFactory implements PeripheralFactory {
    public Peripheral createPeripheral() {
        return new Monitor("Dell Ultrasharp U2719D", 349.99);
    }
}
