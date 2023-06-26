package SDA.school;

import java.util.ArrayList;
import java.util.List;

public class Klasa {
    private String classId;
    private List<Student> studentsList;

    public Klasa(String id) {
        this.classId = id;
        this.studentsList = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        if (student.getClassId() != null) {
            student.getKlasa().studentsList.remove(student);
        }
        student.setClassId(this.classId);
        student.setKlasa(this);
        return this.studentsList.add(student);
    }

    public boolean removeStudent(Student student) {
        if (!student.getClassId().equals(classId)) {
            return false;
        }
        student.setClassId(null);
        student.setKlasa(null);
        return this.studentsList.remove(student);
    }

    public void addList(List<Student> list) {
        for(Student student : list) {
            student.setClassId(this.classId);
            student.setKlasa(this);
            this.studentsList.add(student);
        }
    }

    public List<String> getStudentsNamesList() {
        return this.studentsList.stream().map(Student::getName).toList();
    }

    public String getClassId() {
        return this.classId;
    }

    public List<Student> getStudentsList() {
        return this.studentsList;
    }

    public int getNumberOfStudents() {
        return this.studentsList.size();
    }
}
