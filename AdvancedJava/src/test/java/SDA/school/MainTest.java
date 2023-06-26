package SDA.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
class MainTest {
    @Test
    public void listOfAllSchoolStudentsShoulContainClassLists() {
        // given
        School szkola = new School("Liceum Ogólnokształcące w Poznaniu");
        Klasa klasa1a = new Klasa("1A_LO");
        Klasa klasa2a = new Klasa("2A_LO");

        szkola.addClass(klasa1a);
        szkola.addClass(klasa2a);
        klasa1a.addList(Arrays.asList(  new Student("xyz"), new Student("cde"), new Student("pqr"),
                                        new Student("dfg"), new Student("zźż"), new Student("ggg")));
        klasa2a.addList(Arrays.asList(  new Student("cxyz"), new Student("ucde"), new Student("bpqr"),
                                        new Student("ldfg"), new Student("azźż"), new Student("jggg")));

        // when
        List<Student> klasa1aStudents = klasa1a.getStudentsList();
        List<Student> klasa2aStudents = klasa2a.getStudentsList();
        List<Student> allStudents = szkola.getListOfAllStudents();

        // then
        assertThat(allStudents.size()).isEqualTo(klasa1aStudents.size() + klasa2aStudents.size());
        assertThat(allStudents).containsAll(klasa1aStudents);
        assertThat(allStudents).containsAll(klasa2aStudents);
    }

}