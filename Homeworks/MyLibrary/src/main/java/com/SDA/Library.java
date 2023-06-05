package com.SDA;

import java.util.ArrayList;
import java.util.List;

// Następnie zaimplementuj klasę Library, która reprezentuje bibliotekę.
// Zawiera w sobie kolekcję książek i ma następujące metody:
// - getLongestBook() - zwraca książkę o największej ilości stron
// - getBooksByAuthor(String author) - zwraca wszystkie książki napisane przez danego autora
// - getBooksByGenre(String genre) - zwraca wszystkie książki z danego gatunku
// - getBookByTitle(String title) - zwraca pierwszą napotkaną książkę o danym tytule
// - getBooksByPagesAmount(Integer min, Integer max) - zwraca wszystkie książki, których ilość stron mieści się w danym przedziale
public class Library {
    private List<Book> collection;

    public Library() {
        collection = new ArrayList<>();
    }

    public Library(List<Book> collection) {
        this.collection = collection;
    }

    public Book getLongestBook() {
        Book longestBook = new Book();

        for (Book book : collection) {
            if (book.getPages() > longestBook.getPages()) {
                longestBook = book;
            }
        }
        return longestBook;
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();

        for (Book book : collection) {
            if (book.getAuthor().equals(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    public List<Book> getBooksByGenre(String genre) {
        List<Book> genreBooks = new ArrayList<>();

        for (Book book : collection) {
            if (book.getGenre().equals(genre)) {
                genreBooks.add(book);
            }
        }
        return genreBooks;
    }

    public Book getBookByTitle(String title) {
        for (Book book : collection) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooksByPagesAmount(int min, int max) {
        List<Book> listOfBooks = new ArrayList<>();

        for (Book book : collection) {
            if ((book.getPages() >= min) && (book.getPages() <= max)) {
                listOfBooks.add(book);
            }
        }
        return listOfBooks;
    }

    public void printLibraryTitles() {
        int number = 0;

        for (Book book : collection) {
            System.out.printf("%d.  %s %n", ++number, book.getTitle());
        }
    }

    public void printLibraryDetails() {
        int number = 0;

        for (Book book : collection) {
            System.out.printf("%d.  %s, %s, pages %d, genre %s, rating %d %n", ++number, book.getTitle(), book.getAuthor(),
                    book.getPages(), book.getGenre(), book.getRating());
        }
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public List<Book> getCollection() {
        return collection;
    }

    public void setCollection(List<Book> collection) {
        this.collection = collection;
    }
}
