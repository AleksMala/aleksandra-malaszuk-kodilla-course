package com.kodilla.patterns2.adapter.bookclassiefier;


import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;


public class MedianAdapterTestSuite {

    @Test
    public void publictionYearMedianTest() {
        //Given
        Set<Book> booksA = new HashSet<>();
        booksA.add(new Book("Ciemność płonie", "Artur Ćwiek", 2008, "1"));
        booksA.add(new Book("Psychologia i życie", "Zimbardo", 2012, "2"));
        booksA.add(new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 1918, "3"));
        booksA.add(new Book("Solaris", "Stanisław Lem", 1961, "4"));
        booksA.add(new Book("Altered Carbon", "Richard K. Morgan", 2002, "5"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int mediana = adapter.publicationYearMedian(booksA);
        //Then
        System.out.println(mediana);
        assertEquals(mediana, 2002);
    }
}
