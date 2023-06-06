package SDA.theory;

public class Opel extends Car {

    public Opel(double capacity) {
        super("Opel", capacity);
        //super(capacity);         //inny konstuktor
    }

    @Override
    public void printParameters() {
        System.out.println("Marka: Opel, pojemność: " + getCapacity());
    }

    public void showCapacity () {
        System.out.println(getCapacity()); // metoda getCapacity() pochodzi z klasy Car
    }
}
