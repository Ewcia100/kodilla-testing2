package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library: first");

        Book book1 = new Book("Secrets of Alamo", "John Smith",
                LocalDate.of(2013, 2, 8));
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan",
                LocalDate.of(1988, 4, 9));
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz",
                LocalDate.of(1999, 8, 31));
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch",
                LocalDate.of(1971, 2, 3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library: second");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary=null;
        try{
            deepCloneLibrary=library.deepCopy();
            deepCloneLibrary.setName("Library: third");}
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());
        Assert.assertEquals(4, deepCloneLibrary.getBooks().size());

    }


}
