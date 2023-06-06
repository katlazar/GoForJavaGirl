package SDA.theory;

public class App 
{
    public static void main( String[] args )
    {
        Opel opelCar = new Opel(89.9);
        BMW bmwCar = new BMW("BMW", 101.9);

        Car otherCar = new Opel(74.5);
        //BMW notBMW = (BMW) otherCar;   // wyjątek ClassCastException
        otherCar.getCapacity();
        opelCar.showCapacity();

        showMark(opelCar);
        showMark(bmwCar);
        showMark(otherCar);
    }

    public static void showMark(Car car) {
        System.out.println("Podano auto marki " + car.getMark());
        if (car instanceof Opel) {
            System.out.println(" - opel");
        } else {
            System.out.println(" - nie opel");
        }
    }
}
