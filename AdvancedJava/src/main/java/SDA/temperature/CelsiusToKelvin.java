package SDA.temperature;

public class CelsiusToKelvin implements TemperatureConverter {
    @Override
    public double convert(double temp) {
        return temp + 273.15;
    }
}
