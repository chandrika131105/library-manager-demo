package librarymanager;

public class App {
    public static void main(String[] args) {
        Librarymanager manager = new Librarymanager();
        manager.addBook("The Alchemist", "Paulo Coelho");
        manager.addBook("Clean Code", "Robert C. Martin");

        System.out.println("Searching for 'Clean Code':");
        Book result = manager.searchByTitle("Clean Code");
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Book not found");
        }
    }
    
}
