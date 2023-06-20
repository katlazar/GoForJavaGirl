package SDA.collections;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

// Napisz mechanizm, który skonwertuje listę typu String na listę typu Integer.
public class Main {
    public static void main(String[] args)
    {
        List<String> stringList = new ArrayList<>();
        stringList.add("234");
        stringList.add("-5");
        stringList.add("89");
        stringList.add("-212671");
        List<Integer> intList = convert(stringList);
        for (Integer item : intList) {
            System.out.print(item + ", ");;
        }

    }

    public static List<Integer> convert(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for (String item : stringList) {
            intList.add(parseInt(item));
        }
        return intList;
    }
}
