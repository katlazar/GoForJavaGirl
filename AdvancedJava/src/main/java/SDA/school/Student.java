package SDA.school;

public class Student {
    private static int lastId = 0;
    private int id;
    private String name;
    private String classId;
    private Klasa klasa;

    public Student(String name) {
        this.id = ++lastId;
        this.name = name;
        this.classId = null;
        this.klasa = null;
    }

    public Student(String name, Klasa klasa) {
        this.id = ++lastId;
        this.name = name;
        klasa.addStudent(this);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getClassId() {
        return this.classId;
    }

    public Klasa getKlasa() {
        return this.klasa;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setKlasa(Klasa klasa) {
        this.classId = klasa.getClassId();
        this.klasa = klasa;
    }
}
