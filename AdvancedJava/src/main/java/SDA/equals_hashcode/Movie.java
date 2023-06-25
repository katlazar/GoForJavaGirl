package SDA.equals_hashcode;

// Przygotuj klasę o następujących polach:
//- title (String)
//- reżyser (String)
//- rok wydania (int)
//

public class Movie {
    private String title;
    private String director;
    private int yearOfRelease;

    public Movie(String title, String director, int yearOfRelease) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object obj) {
        Movie movie = (Movie) obj;
        return this.title.equals(movie.title) && this.director.equals(movie.director) && this.yearOfRelease == movie.yearOfRelease;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode() + this.director.hashCode() + this.yearOfRelease;
    }
}

