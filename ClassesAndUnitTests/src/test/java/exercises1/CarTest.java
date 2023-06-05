package exercises1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CarTest {
    @Test
    public void shouldReturnGetterValues() {
        // given
        Car car = new Car("Opel", "Astra", 2007);

        // when
        String make = car.getMake();
        String model = car.getModel();
        int year = car.getYear();
        int mileage = car.getMileage();

        // then
        assertEquals("Astra", model);
        assertThat(make).isEqualTo("Opel");
        assertThat(model).isEqualTo("Astra");
        assertThat(year).isEqualTo(2007);
        assertThat(mileage).isEqualTo(0);
    }

    @Test
    public void shouldReturnUpdatedMileage(){
        //given
        Car car = new Car("Toyota", "Yaris", 2020);

        //when
        car.updateMileage(200);
        car.updateMileage(150);

        //then
        assertThat(car.getMileage()).isEqualTo(200);
    }

}

