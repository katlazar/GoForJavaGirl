package SDA.collections;


import java.util.*;

// Na podstawie listy List<Integer> napisz metodę, który zwróci tylko elementy unikalne, przykładowy input:
//
//
//    List<Integer> values = new ArrayList<>();
//    values.add(10);
//    values.add(11);
//    values.add(10);
//    values.add(11);
//    values.add(12);
//    values.add(11);
public class Lists {
    public static void main(String[] args)
    {
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        System.out.println("Lista bez powtórzeń: " + makeDistinct(values));

        // inny sposób
        System.out.println("Za pomocą Setu: " + new LinkedHashSet<>(values).stream().toList());

        // jeszcze inny sposób
        System.out.println("Za pomocą wbudowanej metody: " + values.stream().distinct().toList());
    }

    public static List<Integer> makeDistinct(List<Integer> inputList) {
        List<Integer> outputList = new ArrayList<>();

        for (Integer value : inputList) {
            if (!outputList.contains(value)) outputList.add(value);
        }
        return outputList;
    }
}
