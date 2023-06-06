package SDA.theory;

public class Opel extends Car {

    public Opel(double capacity) {
        super("Opel", capacity);
        //super(capacity);         //inny konstuktor
    }

    public void showCapacity () {
        System.out.println(getCapacity()); // metoda getCapacity() pochodzi z klasy Car
    }
}
