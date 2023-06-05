package SDA.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        // Array - collection, fixed-size, ordered, index-based
        // List - collection, variable-size, ordered, index-based
        // Set - collection, variable-size, unordered, distinct
        // Map - collection, variable-size, unordered, distinct-key-based

        // Left-side - List is a generic type of list (an ordered, variable-size collection), we also have to let Java know, that it's a collection of Integers
        // Right-side - ArrayList is a specific type of list (the most used one), also we don't have to repeat that it's a list of Integers
        List<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(10);
        listOfNumbers.add(8);
        listOfNumbers.add(-20);
        listOfNumbers.add(15);

        System.out.println("Size: " + listOfNumbers.size());
        for (int number : listOfNumbers) {
            System.out.println(number);
        }

        // add an element at the end of the list
        listOfNumbers.add(1);
        // replace an element on given index
        listOfNumbers.set(0, 10);
        // Read an element on given index
        Integer x = listOfNumbers.get(2);
        // Check whether given element exists in the list
        Boolean exists = listOfNumbers.contains(5);
        // Check whether the list has no elements (is empty)
        Boolean isEmpty = listOfNumbers.isEmpty();
        // Remove an element on given index
        listOfNumbers.remove(1);
        // Remove an element of given value (only necessary for Integers)
        listOfNumbers.remove((Object) 5);
        // Read index of first appearance of element
        int index1 = listOfNumbers.indexOf(-12);

        // Set - collection, variable-size, unordered, distinct
        Set<String> names = new HashSet<>();
        names.add("Mateusz");
        names.add("Karolina");
        names.add("Justyna");
        names.add("Magda");
        names.add("Magda");

        for (String name : names) {
            System.out.println(name);
        }

        names.add("Karol");
        names.remove("Mateusz");
        names.size();
        names.isEmpty();

        String[] arrayOfNames = new String[names.size()];
        Integer index = 0;
        for (String name : names) {
            arrayOfNames[index] = name;
            index++;
        }

        // Map - collection, variable-size, unordered, distinct-key-based

        // Map has two collections
        // A set of keys (distinct)
        // And a collection of values
        // Each key has one value
        // Both key and value can be of any type
        // Recommended key types: Integer, String, Enum
        Map<String, Integer> groceries = new HashMap<>();
        groceries.put("Eggs", 12);
        groceries.put("Milk", 1);
        groceries.put("Water", 1);
        groceries.put("Cookies", 5);

        // Iterate over each map entry
        for (Map.Entry<String, Integer> entry : groceries.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Iterate over keys
        for (String key : groceries.keySet()) {
            System.out.println(key);
        }

        // Iterate over values
        for (Integer value : groceries.values()) {
            System.out.println(value);
        }

        // Adding a new entry
        groceries.put("Bread", 2);
        // Remove an entry by key
        groceries.remove("Bread");
        // Get a value by key
        Integer value = groceries.get("Eggs");
        // Check size (amount of entries)
        groceries.size();
        // Check whether is empty
        groceries.isEmpty();
        // Check whether map has given key
        groceries.containsKey("Chocolate");
        // Replace value for given key
        groceries.replace("Eggs", 20);

        // 2D Arrays
        // This creates an array of arrays, each row can have a different size
        int[][] numbersJaggedArray = new int[4][];
        for (int i = 0; i < numbersJaggedArray.length; i++) {
            numbersJaggedArray[i] = new int[i + 1];
        }

        // This creates a 3x5 grid, each row has the same size
        int[][] numbersGrid = new int[3][5];

        // i - row; j - column; [i][j] - cell
        for (int[] ints : numbersGrid) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
