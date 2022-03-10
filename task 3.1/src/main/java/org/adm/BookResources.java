package org.adm;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/books")
public class BookResources {

    private Set<Book> Book = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public BookResources() {
        Book.add(new Book("Name1", "Author1"));
        Book.add(new Book("Name2", " Author2"));
        Book.add(new Book("Name3", " Author3"));
        Book.add(new Book("Name4", " Author4"));
    }

    @GET
    public Set<Book> list() {
        return Book;
    }

    @POST
    public Set<Book> add(Book book) {
        Book.add((org.adm.Book) Book);
        return Book;
    }

    @DELETE
    public Set<Book> delete(Book book) {
        Book.removeIf(existingBook -> existingBook.bookName.contentEquals(book.bookName));
        return Book;
    }
}