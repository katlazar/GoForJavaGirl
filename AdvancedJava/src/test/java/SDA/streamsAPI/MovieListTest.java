package SDA.streamsAPI;

import SDA.collections.Lists;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MovieListTest {
    @Test
    public void shouldRemoveDuplicatedNumbers() {
        // given
        List<MovieList.Movie> movies = Arrays.asList(
                new MovieList.Movie("Skazani na Shawshank", "sensacyjny", 120L, LocalDate.of(1994, 12, 1)),
                new MovieList.Movie("Forrest Gump", "komedia", 180L, LocalDate.of(1994, 12, 1)),
                new MovieList.Movie("Johnny", "biograficzny", 160L, LocalDate.of(2022, 12, 1)),
                new MovieList.Movie("Jakiś horror", "horror", 19L, LocalDate.of(2024, 12, 1)));

        // when
        Long liczbaDluzszychOd20Min = movies.stream().filter(m -> m.duration > 20L).count();
        Long liczbaNieStarszychNiz2018 = movies.stream().filter(m -> m.releaseDate.getYear() < 2018).count();
        Long liczbaHorrorow = movies.stream().filter(m -> m.type.equals("horror")).count();

        // then
        assertThat(liczbaDluzszychOd20Min).isEqualTo(3);
        assertThat(liczbaNieStarszychNiz2018).isEqualTo(2);
        assertThat(liczbaHorrorow).isEqualTo(1);
    }

}