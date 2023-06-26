package SDA.school;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        School szkola = new School("Liceum Ogólnokształcące w Poznaniu");
        Klasa klasa1a = new Klasa("1A_LO");
        Klasa klasa1b = new Klasa("1B_LO");
        Klasa klasa2a = new Klasa("2A_LO");
        Klasa klasa2b = new Klasa("2B_LO");

        szkola.addClass(klasa1a);
        szkola.addClass(klasa1b);
        szkola.addClass(klasa2a);
        szkola.addClass(klasa2b);

        klasa1a.addList(Arrays.asList(  new Student("Kowalski Piotr"), new Student("Kowalski Michał"),
                                        new Student("Nowicki Marcin"), new Student("Bielska Zuzanna"),
                                        new Student("Zając Wiktoria"), new Student("Wilk Andrzej")));

        Student przewodniczacy = new Student("Grzyb Wojciech", klasa1b);
        new Student("Wąsik Maciej", klasa1b);
        new Student("Adamska Euzebia", klasa1b);
        new Student("Sosna Agnieszka", klasa1b);

        szkola.printListOfStudentsByClass();  // spis uczniów wg klas

        System.out.printf("Alfabetyczna lista wszystkich (%d) uczniów w szkole:%n", szkola.getNumberOfStudents());
        szkola.printOrderedStudentsNames(); // alfabetyczny spis uczniów całej szkoły
    }
}
