package SDA.equals_hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Dodaj dwa jednakowe obiekty (dwie różne instancje ta sama zawartość pól) do dowolnej listy i HashSetu:
//* najpierw bez implementacji metody hashCode i metody Equals
//* z implementacją metody equals
//* z implemenetacją metody hashCode
//Zaobserwuj różnicę (sprawdzaj liczbę elementów przed i po dodaniu).
//
//Dla powyższej listy liczba duplikatów powinna być równa: 2
public class Main {
    public static void main(String[] args) {
        List<Movie> listOfMovies = new ArrayList<>();
        Set<Movie> setOfMovies = new HashSet<>();
        Movie movie1 = new Movie("Joe Black", "Martin Brest", 1998);
        Movie movie2 = new Movie("Joe Black", "Martin Brest", 1998);

        listOfMovies.add(movie1);
        listOfMovies.add(movie2);
        System.out.println("Liczba filmów na liście: " + listOfMovies.size());
        if (listOfMovies.get(0).equals(listOfMovies.get(1))) System.out.println("Znaleziono duplikaty");
        else System.out.println("To są różne filmy");

        setOfMovies.add(movie1);
        setOfMovies.add(movie2);
        System.out.println("Liczba filmów w secie: " + setOfMovies.size());
    }
}
