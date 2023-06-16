package SDA.temperature;

public class CelsiusToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double temp) {
        return (temp * 9.0 / 5.0) + 32.0;
    }
}
