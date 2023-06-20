package SDA.genericTypes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
//        Pair<Integer, String> pair1 = new Pair<>(1, "pierwsza para");
//        Pair<Integer, String> pair2 = new Pair<>(2, "druga para");
//        Pair<String, String> pair3 = new Pair<>("kolejna para", "trzecia para");
//
//        System.out.println(pair1.getFirst() + "  " + pair1.getSecond());
//        System.out.println();

        Integer[] table = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Table: ");
        ArrayUtils.printTable(table);
        ArrayUtils.swap(table, 4, 8);
        System.out.print("Table after swap: ");
        ArrayUtils.printTable(table);

        List<Integer> lista = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
    }

    // Napisz metodę generyczną, które zadaniem będzie zamiana (swap) elementów o wskazanych pozycjach w tablicy.
    // Metoda powinna przyjmować:
    // - tablicę dowolnego typu elementów
    // - pozycję pierwszego elementu
    // - pozycję drugiego elementu
    // tzn, np. jeśli mamy tablice 10 elementów, podamy pozycję 1: 4, pozycję 2: 8 to należy dokonać zamiany:
    // - element pod indeksem 4 musi znaleść się pod indeksem 8, a element o indeksie 8 musi znaleść się pod indeksem 4
    static class ArrayUtils {
        public static <E> void swap(E[] tab, int pos1, int pos2) {
            E temp = tab[pos1];
            tab[pos1] = tab[pos2];
            tab[pos2] = temp;
        }

        public static <E> void printTable(E[] tab) {
            for (E item : tab) System.out.print(item + ", ");
            System.out.println();
        }
    }
}
