package SDA.temperature;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CelsiusToFahrenheitTest {
    @Test
    public void shouldReturnConvertedValues() {
        // given
        CelsiusToFahrenheit converter = new CelsiusToFahrenheit();
        double[] tempInCelsius = new double[] {-15.1, 0, 23.6};
        double[] tempInFahrenheit = new double[tempInCelsius.length];
        double[] convertedTemp = new double[tempInCelsius.length];

        // when
        for (int i = 0; i < tempInCelsius.length; i++) {
            tempInFahrenheit[i] = (tempInCelsius[i] * 9.0 / 5.0) + 32.0;
        }
        for (int i = 0; i < tempInCelsius.length; i++) {
            convertedTemp[i] = converter.convert(tempInCelsius[i]);
        }

        // then
        assertEquals(tempInFahrenheit[0], convertedTemp[0]);
        assertEquals(tempInFahrenheit[1], convertedTemp[1]);
        assertEquals(tempInFahrenheit[2], convertedTemp[2]);
        assertThat(tempInFahrenheit).isEqualTo(convertedTemp);
    }
}
