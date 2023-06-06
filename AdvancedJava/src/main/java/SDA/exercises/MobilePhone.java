package SDA.exercises;

//Stwórz dodatkowo dwie klasy dziedziczące po klasie MobileDevice:
//- MobilePhone z polami: LTE support
//- Tablet -> pencil support
public class MobilePhone extends MobileDevice {
    private String lte; // LTE
    private boolean support; // support

    public MobilePhone(float monitorSize, int memory, String cpu, String system, String lte, boolean support) {
        super(monitorSize, memory, cpu, system);
        this.lte = lte;
        this.support = support;
        super.setType("mobile phone");
    }

    public void showDeviceInfoMobile() {
        showDeviceInfo();
        System.out.println("LTE: " + lte);
        System.out.println("support: " + support);
    }
}
