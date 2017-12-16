package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My list of books");
        Book book = new Book("Ciemność płonie", "Artur Ćwiek", LocalDate.of(2008, 8, 8));
        Book book1 = new Book("Psychologia i życie", "Zimbardo", LocalDate.of(2012, 12, 12));
        Book book2 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(1911, 11, 11));
        Book book3 = new Book("Solaris", "Stanisław Lem", LocalDate.of(1961, 1, 1));

        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("First copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Second copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
    }
}
