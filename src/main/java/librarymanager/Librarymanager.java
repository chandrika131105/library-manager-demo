package librarymanager;
import java.util.ArrayList;
import java.util.List;

public class Librarymanager {
    private List<Book> books = new ArrayList<>();

    // Add a book
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    // Search by title
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
