package SDA.equals_hashcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private Movie movie1 = new Movie("Joe Black", "Martin Brest", 1998);
    private Movie movie2 = new Movie("Joe Black", "Martin Brest", 1998);
    private Movie2 movie3 = new Movie2("Joe Black", "Martin Brest", 1998);
    private Movie2 movie4 = new Movie2("Joe Black", "Martin Brest", 1998);

    @Test
    public void moviesWithTheSameTitleShouldBeDifferentInList() {
        // given
        List<Movie> listOfMovies = new ArrayList<>();

        // when
        listOfMovies.add(movie1);
        listOfMovies.add(movie2);

        // then
        assertThat(listOfMovies.size()).isEqualTo(2);
        assertThat(listOfMovies.get(0)).isNotEqualTo(listOfMovies.get(1));
    }

    @Test
    public void moviesWithTheSameTitleShouldBeDifferentInSet() {
        // given
        Set<Movie> setOfMovies = new HashSet<>();

        // when
        setOfMovies.add(movie1);
        setOfMovies.add(movie2);

        // then
        assertThat(setOfMovies.size()).isEqualTo(2);
    }

    @Test
    public void moviesWithTheSameTitleShouldBeTheSameInList() {
        // given
        List<Movie2> listOfMovies = new ArrayList<>();

        // when
        listOfMovies.add(movie3);
        listOfMovies.add(movie4);

        // then
        assertThat(listOfMovies.size()).isEqualTo(2);
        assertThat(listOfMovies.get(0)).isEqualTo(listOfMovies.get(1));
    }

    @Test
    public void moviesWithTheSameTitleShouldBeTheSameInSet() {
        // given
        Set<Movie2> setOfMovies = new HashSet<>();

        // when
        setOfMovies.add(movie3);
        setOfMovies.add(movie4);

        // then
        assertThat(setOfMovies.size()).isEqualTo(1);
    }
}