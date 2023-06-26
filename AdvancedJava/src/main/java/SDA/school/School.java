package SDA.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private String name;
    private Map<String, Klasa> klasy;

    public School(String name) {
        this.name = name;
        this.klasy = new HashMap<>();
    }

    public void addClass(Klasa klasa) {
        this.klasy.put(klasa.getClassId(), klasa);
    }

    public void removeClass(Klasa klasa) {
        this.klasy.remove(klasa.getClassId());
    }

    public void printListOfStudentsByClass() {
        System.out.println(name);
        for(Map.Entry<String, Klasa> entry : klasy.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for(Student student : entry.getValue().getStudentsList()) {
                System.out.println("  - " + student.getName());
            }
        }
    }

    public List<Student> getListOfAllStudents() {
        List<Student> allStudentsList = new ArrayList<>();
        this.klasy.values().stream().map(Klasa::getStudentsList).forEach(allStudentsList::addAll);
        return allStudentsList;
    }
    public void printOrderedStudentsNames() {
        this.getListOfAllStudents().stream().map(Student::getName).sorted().forEach(System.out::println);
    }

    public int getNumberOfStudents() {
        return this.klasy.values().stream().mapToInt(Klasa::getNumberOfStudents).sum();
    }
}
