package SDA.streamsAPI;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//1. Wybierz liczby parzyste z listy liczb całkowitych.
//2. Oblicz sumę wszystkich liczb z listy liczb zmiennoprzecinkowych.
//3. Znajdź największą liczbę w liście liczb całkowitych.
//4. Posortuj listę napisów alfabetycznie.
//5. Zlicz liczbę wystąpień konkretnego napisu w liście napisów.
//6. Znajdź średnią długość napisów w liście.
//7. Wybierz unikalne liczby z listy liczb całkowitych.
//8. Odrzuć wszystkie liczby ujemne z listy liczb całkowitych.
//9. Znajdź pierwszy napis, który zaczyna się od określonej litery w liście napisów.
//10. Przemnóż wszystkie liczby z listy liczb zmiennoprzecinkowych przez 2.
public class StreamTest {
    @Test
    public void shouldReturnProperValues() {
        // given
        int maxValueInList = 209455;
        List<Integer> listOfIntegers = List.of(-10, 5, 600, -345, maxValueInList, 0, 15, 5, -345, 600);
        List<Double> listOfDouble = List.of(5.7, -123.6, 35466.0, -4555.55, 43.234);
        List<String> listOfStrings = List.of("xyz", "asdfghj", "rbgh", "xyz", "Axgvd", "qwerty", "xyz");

        double sumInDoubleList = 0.0;
        for(double item : listOfDouble) {
            sumInDoubleList += item;
        }

        double lengthSum = 0.0;
        for(String item : listOfStrings) {
            lengthSum += item.length();
        }
        double lengthAverage = lengthSum / listOfStrings.size();

        List<Double> listOfDoubledDouble = new ArrayList<>();
        for(double item : listOfDouble) {
            listOfDoubledDouble.add(2.0 * item);
        }

        // when
        List<Integer> evenNumbers = listOfIntegers.stream().filter(i -> i % 2 == 0).toList();
        double sumOfDouble = listOfDouble.stream().mapToDouble(d -> d).sum();
        int maxValue = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        List<String> sortedList = listOfStrings.stream().sorted().toList();
        long howManyOneString = listOfStrings.stream().filter(s -> s.equals("xyz")).count();
        double avgStringLength = listOfStrings.stream().mapToDouble(String::length).average().getAsDouble();
        List<Integer> distinctNumbers = listOfIntegers.stream().distinct().toList();
        List<Integer> positiveNumbers = listOfIntegers.stream().filter(i -> i >= 0).toList();
        String firstStringStartedWithA = listOfStrings.stream().filter(s -> s.startsWith("A")).toList().get(0);
        List<Double> doubledValues = listOfDouble.stream().map(d -> 2.0 * d).toList();

        // then
        assertThat(evenNumbers).containsExactly(-10, 600, 0, 600);
        assertThat(sumOfDouble).isEqualTo(sumInDoubleList);
        assertThat(maxValue).isEqualTo(maxValueInList);
        assertThat(sortedList).containsExactly("Axgvd", "asdfghj", "qwerty", "rbgh", "xyz", "xyz", "xyz");
        assertThat(howManyOneString).isEqualTo(3);
        assertThat(avgStringLength).isEqualTo(lengthAverage);
        assertThat(distinctNumbers).containsExactly(-10, 5, 600, -345, maxValueInList, 0, 15);
        assertThat(positiveNumbers).containsExactly(5, 600, maxValueInList, 0, 15, 5, 600);
        assertThat(firstStringStartedWithA).isEqualTo("Axgvd");
        assertThat(doubledValues).isEqualTo(listOfDoubledDouble);
    }
}
