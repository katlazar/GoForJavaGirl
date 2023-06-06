package SDA.exercises;

//Stwórz klasę MobileDevice, która będzie klasą bazową z polami:
//- rozmiar wyświetlacza
//- pamięć ram
//- cpu
//- system operacyjny
//- typ urządzenia
//
//Stwórz dodatkowo dwie klasy dziedziczące po klasie MobileDevice:
//- MobilePhone z polami: LTE support
//- Tablet -> pencil support
//
//Stwórz metodę w klasie bazowej:
//- showDeviceInfo, która wyświetli szczegóły urzadzenia
//- metoda powinna zostać nadpisana w klasach pochodnych (wyświetlenie dodatkowych szczegółów)
public class Main {
    public static void main(String[] args)
    {
       MobilePhone iPhone = new MobilePhone(6.1f, 8, "Apple A15 Bionic", "iOS 15 ", true);
       Tablet samsung = new Tablet(10.4f, 3, "Qualcomm Snapdragon 662 ", "Android 10", false);

       iPhone.showDeviceInfo();
       System.out.println();
       samsung.showDeviceInfo();
    }
}
