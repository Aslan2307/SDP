class CelsiusToFahrenheitAdapter implements TemperatureConverter {
    private CelsiusTemperature adaptee;

    public CelsiusToFahrenheitAdapter(CelsiusTemperature adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double convert(double value) {

        return (value * 9 / 5) + 32;
    }
}