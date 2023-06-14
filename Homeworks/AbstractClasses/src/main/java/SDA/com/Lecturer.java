package SDA.com;

// Zaimplementuj klasę Lecturer. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
//* dwa pola: specjalizacja oraz wynagrodzenie
//* konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
//* metody typu getter dla zdeklarowanych pól
//* metody typu setter dla zdeklarowanych pól
//* metodę showDetails wyświetlającą szczegółowe informację o wykładowcy
//Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.

public class Lecturer extends Person {
    private String speciality;
    private double salary;

    public Lecturer(String name, String address, String speciality, double salary) {
        super(name, address);
        this.speciality = speciality;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + super.getName());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Speciality: " + speciality);
        System.out.println("Salary: " + salary);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
