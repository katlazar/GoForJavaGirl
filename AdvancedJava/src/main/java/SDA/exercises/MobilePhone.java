package SDA.exercises;

//Stwórz dodatkowo dwie klasy dziedziczące po klasie MobileDevice:
//- MobilePhone z polami: LTE support
//- Tablet -> pencil support
public class MobilePhone extends MobileDevice {
    private boolean lte; // LTE support

    public MobilePhone(float monitorSize, int memory, String cpu, String system, boolean support) {
        super(monitorSize, memory, cpu, system);
        this.lte = support;
        super.setType("mobile phone");
    }

    @Override
    public void showDeviceInfo() {
        super.showDeviceInfo();
        System.out.println("LTE: " + lte);
    }
}
