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
        System.out.println();

        // klasa Movie2 z implementacją metody equals i hashCode

        List<Movie2> listOfMovies2 = new ArrayList<>();
        Set<Movie2> setOfMovies2 = new HashSet<>();
        Movie2 movie3 = new Movie2("Joe Black", "Martin Brest", 1998);
        Movie2 movie4 = new Movie2("Joe Black", "Martin Brest", 1998);

        listOfMovies2.add(movie3);
        listOfMovies2.add(movie4);
        System.out.println("Liczba filmów na liście: " + listOfMovies2.size());
        if (listOfMovies2.get(0).equals(listOfMovies2.get(1))) System.out.println("Znaleziono duplikaty");
        else System.out.println("To są różne filmy");

        setOfMovies2.add(movie3);
        setOfMovies2.add(movie4);
        System.out.println("Liczba filmów w secie: " + setOfMovies2.size());
    }
}
