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
        stringList.add("1e-10");
        stringList.add("-2000000");

        List<Integer> intList1 = convert1(stringList);
        for (Integer item : intList1) {
            System.out.print(item + ", ");;
        }
        System.out.println();

        try {
            List<Integer> intList2 = convert2(stringList);
            for (Integer item : intList2) {
                System.out.print(item + ", ");;
            }
        }
        catch (OneOfElementsIsNotANumberException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> convert1(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        if (stringList == null) throw new IllegalArgumentException("Given argument is null.");
        for (String item : stringList) {
            try {
                intList.add(parseInt(item));
            }
            catch (NumberFormatException exception) {}
        }
        return intList;
    }

    public static List<Integer> convert2(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        try {
            for (String item : stringList) {
                intList.add(parseInt(item));
            }
        }
        catch (NumberFormatException exception) {
            throw new OneOfElementsIsNotANumberException();
        }
        return intList;
    }
}
