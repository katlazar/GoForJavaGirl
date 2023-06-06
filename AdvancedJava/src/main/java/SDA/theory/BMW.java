package SDA.theory;

public class BMW extends Car {
    public BMW(String mark, double capacity) {
        super(mark, capacity);
    }

    @Override
    public void printParameters() {
        System.out.println("Marka: BMW, pojemność: " + getCapacity());
    }
}
