package SDA.exercises;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class App
{
    public static void main( String[] args )
    {
        // Task 1
        // Stwórz repozytorium z projektem do przechowywania kodu tych zadań i korzystaj z niego podczas rozwiązywania zadań

        // Task 2
        // Stwórz dwa HashSety integerów i zaimplementuj dla nich następujące działania rachunków zbiorów: suma,
        // część wspólna, różnica, suma bez części wspólnej. Wynik działania powinien trafić do trzeciego zbioru.
        Set<Integer> setA = Set.of(1, 2, 3, 4);
        Set<Integer> setB = Set.of(3, 4, 5, 6);

        System.out.print("Set A:  ");
        for (Integer item : setA) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("Set B:  ");
        for (Integer item : setB) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Union
        Set<Integer> setUnion = new HashSet<>(setA);
        setUnion.addAll(setB);

        System.out.print("Union of sets:  ");
        for (Integer item : setUnion) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Intersection
        Set<Integer> setIntersection = new HashSet<>();
        for (Integer item : setA) {
            if (setB.contains(item)) {
                setIntersection.add(item);
            }
        }
        // Another way creating intersection set
//        for (int itemA : setA) {
//            for (int itemB : setB) {
//                if (itemA == itemB) {
//                    setIntersection.add(itemA);
//                    break;
//                }
//            }
//        }

        System.out.print("Intersection of sets:  ");
        for (Integer item : setIntersection) {
            System.out.print(item + " ");
        }
        System.out.println();

        //Difference A-B
        Set<Integer> setDifferenceAB = new HashSet<>();
        System.out.print("Difference of sets A - B:  ");
        for (Integer item : setA){
            if (!setB.contains(item)){
                setDifferenceAB.add(item);
                System.out.print(item + " ");
            }
        }
        System.out.println();

        // Difference B-A
        Set<Integer> setDifferenceBA = new HashSet<>();
        System.out.print("Difference of sets B - A:  ");
        for (Integer item : setB){
            if (!setA.contains(item)){
                setDifferenceBA.add(item);
                System.out.print(item + " ");
            }
        }
        System.out.println();

        //Union without intersection
        Set<Integer> setSymmetricDifference = new HashSet<>(setDifferenceAB);
        setSymmetricDifference.addAll(setDifferenceBA);

        System.out.print("Union without intersection:  ");
        for (Integer item : setSymmetricDifference) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();

        // Task 3
        //Stwórz dwie HashMapy<String, Integer> (jak w liście zakupów) i zaimplementuj ich sumowanie. Np jedna mapa to
        // Jajka: 3; Mleko: 1, a druga to Jajka: 2; Kiełbasa: 2, wynik to Jajka: 5; Mleko: 1; Kiełbasa: 2
        Map<String, Integer> shoppingList1 = Map.of("Eggs", 3, "Milk", 1);
        Map<String, Integer> shoppingList2 = Map.of("Eggs", 2, "Sausage", 2);

        System.out.println("Shopping list 1: ");
        for (Map.Entry<String, Integer> item: shoppingList1.entrySet()) {
            System.out.println("- " + item.getKey() + ": " + item.getValue());
        }
        System.out.println("Shopping list 2: ");
        for (Map.Entry<String, Integer> item: shoppingList2.entrySet()) {
            System.out.println("- " + item.getKey() + ": " + item.getValue());
        }
        System.out.println();

        // Sum
        Map<String, Integer> shoppingListSum = new HashMap<>(shoppingList1);
        for (String key : shoppingList2.keySet()) {
            if (shoppingList1.containsKey(key)) {
                shoppingListSum.put(key, Math.max(shoppingList1.get(key), shoppingList2.get(key)));
            } else {
                shoppingListSum.put(key, shoppingList2.get(key));
            }
        }

        System.out.println("Sum of shopping lists: ");
        for (String key : shoppingListSum.keySet()) {
            int quantity = shoppingListSum.get(key);
            System.out.println("- " + key + ": " + quantity);
        }
        System.out.println();

        // Task 4
        // Zaimplementuj pozostałe działania rachunku zbiorów (część wspólna, różnica, suma bez części wspólnej)
        // dla HashMap z listami zakupów.

        // Intersection
        Map<String, Integer> shoppingListInter = new HashMap<>();
        for (String key: shoppingList1.keySet()){
            if (shoppingList2.containsKey(key)){
                shoppingListInter.put(key, Math.min(shoppingList1.get(key), shoppingList2.get(key)));
            }
        }
        System.out.println("Intersection of shopping lists: ");
        for (String key : shoppingListInter.keySet()) {
            int quantity = shoppingListInter.get(key);
            System.out.println("- " + key + ": " + quantity);
        }
        System.out.println();

        // Difference (list1 - list2)
        Map<String, Integer> shoppingListDiff12 = new HashMap<>();
        System.out.println("Difference of shopping lists (1 - 2): ");
        for (String key: shoppingList1.keySet()){
            if (shoppingList2.containsKey(key)){
                int quantity = shoppingList1.get(key) - shoppingList2.get(key);
                if (quantity  > 0) {
                    shoppingListDiff12.put(key, quantity );
                    System.out.println("- " + key + ": " + quantity );
                }
            } else {
                shoppingListDiff12.put(key, shoppingList1.get(key));
                System.out.println("- " + key + ": " + shoppingList1.get(key));
            }
        }
        System.out.println();

        // Difference (list2 - list1)
        Map<String, Integer> shoppingListDiff21 = new HashMap<>();
        System.out.println("Difference of shopping lists (2 - 1): ");
        for (String key: shoppingList2.keySet()){
            if (shoppingList1.containsKey(key)){
                int quantity = shoppingList2.get(key) - shoppingList1.get(key);
                if (quantity  > 0) {
                    shoppingListDiff21.put(key, quantity );
                    System.out.println("- " + key + ": " + quantity );
                }
            } else {
                shoppingListDiff12.put(key, shoppingList2.get(key));
                System.out.println("- " + key + ": " + shoppingList2.get(key));
            }
        }
        System.out.println();

        // Symmetric difference
        System.out.println("Symmetric difference of shopping lists: ");
        for (String key: shoppingListDiff12.keySet()) {
            int quant = shoppingListDiff12.get(key);
            System.out.println("- " + key + ": " + quant);
        }
        for (String key: shoppingListDiff21.keySet()) {
            int quant = shoppingListDiff21.get(key);
            System.out.println("- " + key + ": " + quant);
        }
    }
}
