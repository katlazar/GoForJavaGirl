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
}

