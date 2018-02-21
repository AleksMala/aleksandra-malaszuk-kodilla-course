package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();
        BookSignature bookSignature = new BookSignature(bookSet.stream().iterator().next().getSignature());
        Book book = bookSet.iterator().next();
        for(int n=0; n<bookSet.size(); n++){
            books.put(bookSignature, new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear(), book.getSignature()));
            n++;
        }
        return madianPublicationYear(books);
    }
}
