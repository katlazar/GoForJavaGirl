package SDA.interfaces;

public interface MovieRepositoryApi {
    void add(Movie movie);
    void delete(int index);
    Movie[] findAll();
    Movie findByTitle(String title);
    void printAll();
}
