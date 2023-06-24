package SDA.streamsAPI;

import SDA.interfaces.Movie;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

// Korzystając z Stream API, napisz funkcję, która dla poniższego przykładu:
//
//
//     List<Movie> movies = Arrays.asList(….)
//    gdzie Movie to klasa
//    class Movie {
//    String title;
//    String type;
//    long duration; //min
//    LocalDate releaseDate
//    }
//
//zwróci listę filmów, gdzie:
//- długość filmu będzie większa niż 20 min
//- rok wydania nie będzie starszy niż 2018
//- typ to horror
public class MovieList {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Skazani na Shawshank", "sensacyjny", 120L, LocalDate.of(1994, 12, 1)),
                new Movie("Forrest Gump", "komedia", 180L, LocalDate.of(1994, 12, 1)),
                new Movie("Johnny", "biograficzny", 160L, LocalDate.of(2022, 12, 1)),
                new Movie("Jakiś horror", "horror", 19L, LocalDate.of(2024, 12, 1)),
                new Movie("Inny horror", "horror", 60L, LocalDate.of(2000, 12, 1)));


        long liczbaDluzszychOd20Min = movies.stream().filter(m -> m.duration > 20L).count();
        long liczbaNieStarszychNiz2018 = movies.stream().filter(m -> m.releaseDate.getYear() < 2018).count();
        long liczbaHorrorow = movies.stream().filter(m -> m.type.equals("horror")).count();
        System.out.println("Liczba filmów dłuższych niż 20 min: " + liczbaDluzszychOd20Min);
        System.out.println("Liczba filmów wydanych przed 2018: " + liczbaNieStarszychNiz2018);
        System.out.println("Liczba horrorów: " + liczbaHorrorow);

        long liczbaFilmowSpelniajacychWszystkieWarunki = movies.stream()
                .filter(m -> m.duration > 20L)
                .filter(m -> m.releaseDate.getYear() < 2018 && m.type.equals("horror"))
                .count();
        System.out.println(liczbaFilmowSpelniajacychWszystkieWarunki);
    }
    public static class Movie {
        String title;
        String type;
        long duration; //min
        LocalDate releaseDate;

        public Movie(String title, String type, long duration, LocalDate releaseDate) {
            this.title = title;
            this.type = type;
            this.duration = duration;
            this.releaseDate = releaseDate;
        }
    }
}
