package SDA.interfaces;

public class Movie {
    private String title;
    private int yearOfRelease;

    public Movie(String title, int year) {
        this.title = title;
        this.yearOfRelease = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
