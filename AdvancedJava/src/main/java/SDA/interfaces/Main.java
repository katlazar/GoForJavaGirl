package SDA.interfaces;

public class Main {
    public static void main(String[] args)
    {
        Movie film1 = new Movie("Skazani na Shawshank", 1994);
        Movie film2 = new Movie("Forrest Gump", 1994);
        Movie film3 = new Movie("Johnny", 2022);
        MovieRepository repository = new MovieRepository();
        repository.add(film3);
        repository.add(film2);
        repository.add(film1);
        repository.printAll();
        repository.delete(2);
        repository.printAll();
        System.out.println(repository.findByTitle("Johnny").getYearOfRelease());
    }
}
