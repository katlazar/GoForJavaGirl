package SDA.com;

public class App 
{
    public static void main( String[] args )
    {
        Student student1 = new Student("Jan Kowalski", "Poziomkowa 5, Warszawa", "magisterskie", 3, 5000.00);
        Lecturer lecturer1 = new Lecturer("Piotr Nowak", "Truskawkowa 5, Warszawa", "maths", 6500.00);
        student1.showDetails();
        lecturer1.showDetails();
    }
}
