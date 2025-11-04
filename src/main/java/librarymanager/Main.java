package librarymanager;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "978-0-618-64015-7");
        Book book2 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "978-0-345-39180-3");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the library:");
        library.listBooks();
    }
}
