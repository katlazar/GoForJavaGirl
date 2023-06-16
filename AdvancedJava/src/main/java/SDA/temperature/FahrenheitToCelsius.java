package SDA.temperature;

public class FahrenheitToCelsius implements TemperatureConverter {
    @Override
    public double convert(double temp) {
        return (temp - 32.0) * 5.0 / 9.0;
    }
}
