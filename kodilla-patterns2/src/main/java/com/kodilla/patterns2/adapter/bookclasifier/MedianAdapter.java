package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

//        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books =
//                bookSet.stream().collect(Collectors.toMap(Book::getSignature, Book:: ));

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        BookSignature bookSignature = new BookSignature(bookSet.stream().iterator().next().getSignature());
        com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookb =
                new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                        bookSet.stream().iterator().next().getAuthor(), bookSet.stream().iterator().next().getTitle(),
                        bookSet.stream().iterator().next().getPublicationYear(), bookSet.stream().iterator().next().getSignature());
        for(int n=0; n<bookSet.size(); n++) {
            books.put(bookSignature, bookb);
        }
        return madianPublicationYear(books);
    }
}
