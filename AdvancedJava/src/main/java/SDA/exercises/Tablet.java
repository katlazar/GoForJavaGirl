package SDA.exercises;

//Stwórz dodatkowo dwie klasy dziedziczące po klasie MobileDevice:
//- MobilePhone z polami: LTE support
//- Tablet -> pencil support
public class Tablet extends MobileDevice {
    private boolean pencil; // pencil support

    public Tablet(float monitorSize, int memory, String cpu, String system, boolean pencil) {
        super(monitorSize, memory, cpu, system);
        this.pencil = pencil;
        super.setType("tablet");
    }

    @Override
    public void showDeviceInfo() {
        super.showDeviceInfo();
        System.out.println("pencil: " + pencil);
    }
}
