package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        BookA book1 = new BookA("Coben", "Play dead", 1990, "1234");
        BookA book2 = new BookA("Coben", "No Second Chance", 2003, "1235");
        BookA book3 = new BookA("Coben", "Just One Look", 2004, "1235");
        BookA book4 = new BookA("Coben", "Stay Close", 2012, "1236");
        BookA book5 = new BookA("Coben", "Home", 2016, "1237");

        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(book1);
        bookASet.add(book2);
        bookASet.add(book3);
        bookASet.add(book4);
        bookASet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookASet);
        System.out.println(median);
        assertEquals(2004, median);

    }
}
