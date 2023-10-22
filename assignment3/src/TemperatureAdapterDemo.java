public class TemperatureAdapterDemo {
    public static void main(String[] args) {

        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(32);
        CelsiusTemperature celsiusTemperature = new CelsiusTemperature(0);


        TemperatureConverter fahrenheitToCelsiusAdapter = new FahrenheitToCelsiusAdapter(fahrenheitTemperature);
        TemperatureConverter celsiusToFahrenheitAdapter = new CelsiusToFahrenheitAdapter(celsiusTemperature);


        double celsiusValue = fahrenheitToCelsiusAdapter.convert(fahrenheitTemperature.getTemperatureInFahrenheit());
        double fahrenheitValue = celsiusToFahrenheitAdapter.convert(celsiusTemperature.getTemperatureInCelsius());

        System.out.println("32°F in Celsius is: " + celsiusValue + "°C");
        System.out.println("0°C in Fahrenheit is: " + fahrenheitValue + "°F");
    }
}


