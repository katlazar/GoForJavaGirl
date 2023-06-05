package com.SDA;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Book book2 = new Book("Harry Potter i Komnata Tajemnic", "J.K. Rowling", 368, "Fantasy", 4);
        Book book1 = new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 328, "Fantasy", 4, book2);
        Book book5 = new Book("Siostra cienia", "Lucinda Riley", 570, "Obyczajowa", 5);
        Book book4 = new Book("Siostra burzy", "Lucinda Riley", 576, "Obyczajowa", 5, book5);
        Book book3 = new Book("Siedem sióstr", "Lucinda Riley", 544, "Obyczajowa", 5, book4);
        Book book6 = new Book("Morderstwo w Orient Expressie", "Agatha Christie", 264, "Kryminał", 4);
        Book book7 = new Book("Dwanaście prac Herkulesa", "Agatha Christie", 318, "Kryminał", 3);

        Library myLitleLibrary = new Library();
        myLitleLibrary.addBook(book7);
        myLitleLibrary.addBook(book1);
        myLitleLibrary.addBook(book4);
        myLitleLibrary.addBook(book5);
        myLitleLibrary.addBook(book6);
        myLitleLibrary.addBook(book2);
        myLitleLibrary.addBook(book3);

        // All my library - list of books with details
        System.out.println("All books in my library:");
        myLitleLibrary.printLibraryDetails();
        System.out.println();

        // Book with the highest number of pages
        System.out.printf("The longest book->  %s (%d pages) %n%n", myLitleLibrary.getLongestBook().getTitle(), myLitleLibrary.getLongestBook().getPages());

        // All books of the selected author
        String author = "Agatha Christie";
        printTitles(String.format("Books of %s:", author), myLitleLibrary.getBooksByAuthor(author));

        // All books in the selected genre
        String genre = "Fantasy";
        printTitles(String.format("%s books:", genre), myLitleLibrary.getBooksByGenre(genre));

        // The first book with the selected title - information about book
        myLitleLibrary.getBookByTitle("Harry Potter i Kamień Filozoficzny").printBookInfo();

        // All books with number of pages between
        int min = 200;
        int max = 400;
        printTitles(String.format("Books with number of pages between %d and %d:", min, max), myLitleLibrary.getBooksByPagesAmount(min, max));
    }

    private static void printTitles(String listTitle, List<Book> books) {
        int number = 0;

        System.out.println(listTitle);
        for (Book book : books) {
            System.out.printf("%d.  %s %n", ++number, book.getTitle());
        }
        System.out.println();
    }
}