package exercises1;
public class Car {
    private String make; //(marka samochodu)
    private String model; // (model samochodu)
    private int year; // (rok produkcji samochodu)
    private int mileage; // (przebieg samochodu)

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }

    public void updateMileage(int mileage) {
        if (mileage > this.mileage) this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }
}
