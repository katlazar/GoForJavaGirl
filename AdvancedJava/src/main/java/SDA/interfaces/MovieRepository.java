package SDA.interfaces;

public class MovieRepository implements MovieRepositoryApi {

    private Movie[] movies;

    @Override
    public void add(Movie movie) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public Movie[] findAll() {
        return this.movies;
    }

    @Override
    public Movie findByTitle(String title) {
        return null;
    }
}
