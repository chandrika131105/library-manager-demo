package librarymanager;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void getBooks_returnsAddedBooksInOrder() {
        Library library = new Library();
        Book a = new Book("Book A", "Author A");
        Book b = new Book("Book B", "Author B");

        library.addBook(a);
        library.addBook(b);

        List<Book> books = library.getBooks();
        assertEquals(2, books.size());
        assertSame(a, books.get(0));
        assertSame(b, books.get(1));
    }

    @Test
    void getBooks_isUnmodifiable() {
        Library library = new Library();
        library.addBook(new Book("X", "Y"));

        List<Book> books = library.getBooks();
        assertThrows(UnsupportedOperationException.class, () -> books.add(new Book("Z", "W")));
    }
}
