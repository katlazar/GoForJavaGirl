package exercises1;

import java.util.Scanner;

/*
Zadanie polega na stworzeniu klasy o nazwie "org.example.Car" (Samochód) z następującymi właściwościami i metodami:

Pola:

make (marka samochodu)
model (model samochodu)
year (rok produkcji samochodu)
mileage (przebieg samochodu)

Metody:

(make, model, year) - konstruktor klasy, który inicjalizuje właściwości marki, modelu i roku produkcji samochodu. Przebieg samochodu powinien być ustawiony na 0.
getMake() - zwraca markę samochodu.
getModel() - zwraca model samochodu.
getYear() - zwraca rok produkcji samochodu.
getMileage() - zwraca przebieg samochodu.
updateMileage(mileage) - aktualizuje przebieg samochodu na podstawie podanej wartości mileage ale tylko jeśli podana wartość w argumencie jest większa od już przypisanej do pola.

Testy jednostkowe:

Do każdej z metod klasy napisz dedykowany test jednostkowy sprawdzający poprawność implementacji.
 */
public class App2
{
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = scanner.nextInt();

        for(char c: text.toCharArray()) {
            if ((int)c > 96 && (int)c < 123) System.out.print((char)(((int)c - 96 + n) % 26 + 96));
            else System.out.print(c);
        }
    }
    public static void main( String[] args )
    {
        Car opelAstra = new Car("Opel", "Astra", 2007);
        Car fiatSeicento = new Car("Fiat", "Seicento", 1999);

        opelAstra.updateMileage(100000);
        fiatSeicento.updateMileage(150000);
        System.out.println(fiatSeicento.getMileage());
        fiatSeicento.updateMileage(1500);
        System.out.println(fiatSeicento.getMileage());


    }
}
