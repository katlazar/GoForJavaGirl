package SDA.functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> funkcjaTestujacaDlugoscStringu = (a) -> a.length() > 15;

        boolean result1 = funkcjaTestujacaDlugoscStringu.test("krótki napis");
        boolean result2 = funkcjaTestujacaDlugoscStringu.test("dużo dłuższy napis");

        Consumer<String> funkcjaNicNieZwracajaca = (a) -> System.out.println(a);
    }
}
