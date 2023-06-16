package SDA.interfaces;

public class MovieRepository implements MovieRepositoryApi {

    private final Movie[] movies;
    private static final int maxCountOfMovies = 1000;
    int counter;

    public MovieRepository() {
        this.movies = new Movie[maxCountOfMovies+1];
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void add(Movie movie) {
        if (counter < maxCountOfMovies) {
            movies[counter++] = movie;
        }
    }

    @Override
    public void delete(int index) {
        if (index > 0 && index <= counter) {
            for (int i = index - 1; i < counter; i++) {
                movies[i] = movies[i + 1];
            }
            counter--;
        }
    }

    @Override
    public Movie[] findAll() {
        return this.movies;
    }

    @Override
    public Movie findByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public void printAll() {
        for (int i = 0; i < counter; i++) {
            System.out.printf("%d. %s, %d%n", i+1, movies[i].getTitle(), movies[i].getYearOfRelease());
        }
        System.out.println();
    }
}
