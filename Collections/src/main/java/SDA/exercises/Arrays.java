package SDA.exercises;

public class Arrays
{
    public static void main( String[] args ) {
        // Zadanie 2:
        // Stwórz tablicę nazw europejskich miast i następnie wypisz je na następujące sposoby:
        String[] citiesEU = new String[]{"Berlin", "Sofia", "Warszawa", "Praga", "Paryż", "Rzym", "Madryt"};

        // od początku do końca
        System.out.println("European cities from beginning to end:");
        for (String city : citiesEU) {
            System.out.println(" - " + city);
        }
        System.out.println();

        // od końca do początku
        System.out.println("European cities from end to beginning:");
        for (int i = citiesEU.length - 1; i >= 0; i--) {
            System.out.println(" " + (i + 1) + ". " + citiesEU[i]);
        }
        System.out.println();

        // co drugie miasto
        System.out.println("European cities - every second city:");
        for (int i = 1; i < citiesEU.length; i += 2) {
            System.out.println(" " + (i + 1) + ". " + citiesEU[i]);
        }
        System.out.println();

        // Zadanie 3:
        // Stwórz tablicę liczb zmiennoprzecinkowych
        float[] numbers = new float[]{2.5f, -3.8f, 30.7f, 2.6f, 1.0f};

        // i następnie oblicz sumę oraz średnią tych liczb.
        System.out.print("Table of float numbers:");
        float sum = 0.0f;
        for (float number : numbers) {
            System.out.print("   " + number);
            sum += number;
        }
        float avg = sum / numbers.length;
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println();

        // Zadanie 4:
        // Stwórz tablicę imion (z powtórzeniami)
        String[] names = new String[] {"Jan", "Alicja", "Katarzyna", "Beata", "Jan", "Magda", "Jan", "Mateusz"};

        // i następnie policz, ile razy występuje w niej imię "Jan".
        System.out.print("Table of names:");
        String searchedName = "Jan";
        int count = 0;
        for (String name : names) {
            System.out.print("  " + name);
            if (name.equals(searchedName)) {
                count++;
            }
        }
        System.out.println();
        System.out.println("The name " + searchedName + " appears " + count + " times.");
        System.out.println();

        // Zadanie 5:
        //Stwórz tablicę imion (bez powtórzeń)
        String[] names2 = new String[] {"Alicja", "Katarzyna", "Beata", "Jan", "Igor", "Magda", "Karolina", "Mateusz"};
        System.out.println("Table of names:");
        for (int i = 0; i < names2.length ; i++) {
            System.out.println(" [" + i + "] " + names2[i]);
        }

        // i następnie podaj, na którym indexie znajduje się w niej imię "Jan".
        for (int i = 0; i < names2.length ; i++) {
            if(names2[i].equals(searchedName)) {
                System.out.println("The name " + searchedName + " has index = " + i);
                break;
            }
        }
        System.out.println();

        // Zadanie 6:
        // Stwórz tablicę liczb całkowitych
        int[] intNumbers = new int[] {-8, 10, -1, 2, 150, -18, 0};

        // i następnie znajdź największy i najmniejszy element tej tablicy.
        System.out.print("Table of integer numbers:");
        int max = intNumbers[0];
        int min = max;
        for (int intNumber : intNumbers) {
            System.out.print("   " + intNumber);
            if (intNumber > max) {
                max = intNumber;
            } else if (intNumber < min) {
                min = intNumber;
            }
        }
        System.out.println();
        System.out.println("Max = " + max + " Min = " + min);
    }
}

