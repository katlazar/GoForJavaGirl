package SDA.theory;

public abstract class Car {
    private String mark;
    private double capacity;

    public Car() {}

    public Car(String mark, double capacity) {
        this.mark = mark;
        this.capacity = capacity;
    }

    public Car(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getMark() {
        return mark;
    }

    public abstract void printParameters();
}
