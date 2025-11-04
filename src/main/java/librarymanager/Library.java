package librarymanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /**
     * Returns an unmodifiable view of the current books in the library.
     */
    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }
}
