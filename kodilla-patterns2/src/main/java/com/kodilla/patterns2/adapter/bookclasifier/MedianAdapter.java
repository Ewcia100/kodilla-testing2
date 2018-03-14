package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookB> booksMap = new HashMap<>();

        for (BookA bookA : bookASet) {
            BookB bookB = new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            BookSignature bookSignature = new BookSignature(bookA.getSignature());
            booksMap.put(bookSignature, bookB);
        }
        return medianPublicationYear(booksMap);

    }


}
