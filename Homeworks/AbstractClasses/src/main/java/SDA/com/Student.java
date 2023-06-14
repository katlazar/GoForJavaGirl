package SDA.com;

// Zaimplementuj klasę Student. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
//* trzy pola: typ studiów, rok studiów, koszt studiów
//* konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
//* metody typu getter dla zdeklarowanych pól
//* metody typu setter dla zdeklarowanych pól
//* metoda showDetails wyświetlająca szczegółowe informacje o studencie

public class Student extends Person {
    private String type;
    private int year;
    private double cost;

    public Student(String name, String address, String type, int year, double cost) {
        super(name, address);
        this.type = type;
        this.year = year;
        this.cost = cost;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + super.getName());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Type of studies: " + type);
        System.out.println("Year of studies: " + year);
        System.out.println("Cost: " + cost);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
