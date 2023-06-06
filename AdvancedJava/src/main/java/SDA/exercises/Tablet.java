package SDA.exercises;

//Stwórz dodatkowo dwie klasy dziedziczące po klasie MobileDevice:
//- MobilePhone z polami: LTE support
//- Tablet -> pencil support
public class Tablet extends MobileDevice {
    private boolean pencil; // pencil
    private boolean support; // support

    public Tablet(float monitorSize, int memory, String cpu, String system, boolean pencil, boolean support) {
        super(monitorSize, memory, cpu, system);
        this.pencil = pencil;
        this.support = support;
        super.setType("tablet");
    }

    public void showDeviceInfoTablet() {
        showDeviceInfo();
        System.out.println("pencil: " + pencil);
        System.out.println("support: " + support);
    }
}
