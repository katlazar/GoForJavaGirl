package SDA.equals_hashcode;

public class Movie2 {
    private String title;
    private String director;
    private int yearOfRelease;

    public Movie2(String title, String director, int yearOfRelease) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object obj) {
        Movie2 movie = (Movie2) obj;
        return this.title.equals(movie.title) && this.director.equals(movie.director) && this.yearOfRelease == movie.yearOfRelease;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode() + this.director.hashCode() + this.yearOfRelease;
    }
}
