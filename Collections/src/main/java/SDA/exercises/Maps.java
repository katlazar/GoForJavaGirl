package SDA.exercises;

import java.util.*;

public class Maps
{
    public static void main( String[] args )
    {
        //ZADANIA DO PRACY SAMODZIELNEJ:
        //Lista TODO - napisz program, w którym użytkownik wpisuje linijki tekstu.
        // Te linijki następnie są przez program "zapamiętywane" i po kolei wyświetlane.
        // Działanie programu: przywitanie, użytkownik wpisuje linijkę tekstu,
        // ta zostaje wyświetlona (wraz z miejscem na liście, licząc od zera),
        // a następnie program znowu czeka, aż użytkownik coś wpisze. Itd.

        Scanner scanner = new Scanner(System.in);
        List<String> listToDo = new ArrayList<>();
        String newTask = "";
        int index = 0;

        System.out.println("Hello, make your TODO list!");
        do {
            System.out.println("Write your task:");
            newTask = scanner.nextLine();
            listToDo.add(newTask);
            System.out.println(index + ". " + listToDo.get(index));
            index++;
            System.out.println();
        } while (!newTask.equals("end"));

        System.out.println("Whole TODO list: ");
        for (int i = 0; i < listToDo.size()-1; i++) {
            System.out.println(i + ". " + listToDo.get(i));
        }
        System.out.println();

        //Lista zakupów - napisz program, w którym użytkownik wpisuje rzeczy
        // na listę zakupów. Jeżeli użytkownik wpisze po raz pierwszy dany produkt,
        // zostaje od dodany do listy z ilością 1. Każde ponowne wpisanie tego produktu
        // zwiększa ilość o jeden. Po każdym wpisaniu, program wypisuje całą listę.
        // Np. trzykrotne wpisane "Jajka" da taki output: Jajka: 3.
        Map<String, Integer> groceries = new HashMap<>();
        String newItem = "";

        System.out.println("Hello, make your shopping list!");
        do {
            System.out.println("Write an item to buy:");
            newItem = scanner.nextLine();
            if (groceries.containsKey(newItem)){
                groceries.put(newItem, groceries.get(newItem)+1);
            } else {
                groceries.put(newItem, 1);
            }
            for (Map.Entry<String, Integer> entry : groceries.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + ": " + value);
            }
            System.out.println();
        } while (!newItem.equals("end"));

    }
}
