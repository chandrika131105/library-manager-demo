package librarymanager;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibrarymanagerTest {

    @Test
    void addAndSearch_returnsBook() {
        Librarymanager manager = new Librarymanager();
        manager.addBook("Clean Code", "Robert C. Martin");

        Book found = manager.searchByTitle("Clean Code");
        assertNotNull(found, "Expected to find the book by title");
        assertEquals("Robert C. Martin", found.getAuthor());
    }

    @Test
    void search_nonexistent_returnsNull() {
        Librarymanager manager = new Librarymanager();
        manager.addBook("The Pragmatic Programmer", "Andrew Hunt");

        Book found = manager.searchByTitle("Nonexistent");
        assertNull(found, "Expected null when title is not present");
    }

    @Test
    void getAllBooks_returnsAll() {
        Librarymanager manager = new Librarymanager();
        manager.addBook("Book A", "Author A");
        manager.addBook("Book B", "Author B");

        List<Book> all = manager.getAllBooks();
        assertEquals(2, all.size(), "Expected exactly two books in the manager");
        assertEquals("Book A", all.get(0).getTitle());
        assertEquals("Book B", all.get(1).getTitle());
    }
}
