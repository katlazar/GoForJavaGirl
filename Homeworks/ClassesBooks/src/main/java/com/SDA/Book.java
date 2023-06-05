package com.SDA;
// Zaimplementuj klasę Book, która reprezentuje książkę i zawiera takie informacje, jak tytuł, autor, ilość stron,
// gatunek oraz ocena w skali 1-5, a także referencja do kontynuacji (jeżeli istnieje, np Harry Potter i Kamień Filozoficzny
// ma kontynuację, jaką jest Harry Potter i Komnata Tajemnic).
public class Book {
    private String title;
    private String author;
    private int pages;
    private String genre;
    private int rating;
    private Book nextBook;

    public Book(String title, String author, int pages, String genre, int rating) {
        this.title = title;
        this.author = author;
        this.pages = pages < 0 ? 1 : pages;
        this.genre = genre;
        this.rating = (rating < 1) ? 1 : ((rating > 5) ? 5 : rating);
        this.nextBook = null;
    }

    public Book(String title, String author, int pages, String genre, int rating, Book nextBook) {
        this.title = title;
        this.author = author;
        this.pages = pages < 0 ? 1 : pages;
        this.genre = genre;
        this.rating = (rating < 1) ? 1 : ((rating > 5) ? 5 : rating);
        this.nextBook = nextBook;
    }

    public Book() {
        title = "";
        author = "";
        pages = 0;
        genre = "";
        rating = 0;
        nextBook = null;
    }

    public void printBookInfo() {
        System.out.println("Book info:");
        System.out.println("- Title:   " + title);
        System.out.println("- Author:  " + author);
        System.out.println("- Pages:   " + pages);
        System.out.println("- Genre:   " + genre);
        System.out.println("- Rating:  " + rating);
        if (nextBook != null) {
            System.out.println("- Next in series:  " + nextBook.title);
        }
        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Book getNextBook() {
        return nextBook;
    }

    public void setNextBook(Book nextBook) {
        this.nextBook = nextBook;
    }
}
