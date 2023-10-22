class FahrenheitToCelsiusAdapter implements TemperatureConverter {
    private FahrenheitTemperature adaptee;

    public FahrenheitToCelsiusAdapter(FahrenheitTemperature adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double convert(double value) {

        return (value - 32) * 5 / 9;
    }
}
