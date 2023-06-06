package SDA.exercises;

//Stwórz klasę MobileDevice, która będzie klasą bazową z polami:
//- rozmiar wyświetlacza
//- pamięć ram
//- cpu
//- system operacyjny
//- typ urządzenia

//Stwórz metodę w klasie bazowej:
//- showDeviceInfo, która wyświetli szczegóły urzadzenia
//- metoda powinna zostać nadpisana w klasach pochodnych (wyświetlenie dodatkowych szczegółów)
public class MobileDevice {
    private float monitorSize; // rozmiar wyświetlacza
    private int memory; // pamięć ram
    private String cpu; // cpu
    private String system; // system operacyjny
    private String type;  // typ urządzenia

    public MobileDevice(float monitorSize, int memory, String cpu, String system) {
        this.monitorSize = monitorSize;
        this.memory = memory;
        this.cpu = cpu;
        this.system = system;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showDeviceInfo() {
        System.out.println("ekran: " + monitorSize);
        System.out.println("pamięć RAM: " + memory);
        System.out.println("procesor: " + cpu);
        System.out.println("system: " + system);
        System.out.println("typ urządzenia: " + type);
    }
}
