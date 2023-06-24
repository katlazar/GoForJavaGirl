package SDA.streamsAPI;


import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> dane = List.of("słowo1", "dłuższe słowo", "xyz 12355", "dłuższe słowo");

        Long result = dane.stream()
                .filter(s -> s.contains(" "))
                .peek(System.out::println)
                .map(s2 -> s2.replace("ł", ""))
                .peek(System.out::println)
                .distinct()
                .sorted()
                .peek(System.out::println)
                .count();
        System.out.println(result);

        List<Integer> listaInteger = Stream.of("123", "12345", "-3455")
                .map(Integer::parseInt)
                .toList();
        System.out.println(listaInteger);

        System.out.println(dane.stream().min(Comparator.comparingInt(String::length)).get());

        // kilka sposobów na uzyskanie tego samego efektu
        System.out.println(Stream.of(1, 2, -11, 4, 5).min(Comparator.comparingInt(x -> x)).get());
        System.out.println(Stream.of(1, 2, -11, 4, 5).max(Comparator.reverseOrder()).get());
        System.out.println(Stream.of(1, 2, -11, 4, 5).min(Comparator.naturalOrder()).get());

        IntStream.range(0, 10).filter(i -> i % 3 == 0).forEach(System.out::println);
        System.out.println(Stream.of("123", "12345", "-3455").mapToInt(a -> Integer.parseInt(a)).sum());
    }
}
