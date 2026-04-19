import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo2 {
    public static void main(String[] args) {

        HashMap<String, String> bookMap = new HashMap<>();

        // Add book-author records
        bookMap.put("Harry Potter", "J.K. Rowling");
        bookMap.put("The Hobbit", "J.R.R. Tolkien");
        bookMap.put("Atomic Habits", "James Clear");
        bookMap.put("The Alchemist", "Paulo Coelho");
        bookMap.put("Clean Code", "Robert Martin");

        // Display all records
        System.out.println(bookMap);

        // Get author of one book
        System.out.println(bookMap.get("The Hobbit"));

        // Check if a book exists
        System.out.println(bookMap.containsKey("Harry Potter"));

        // Check a book that does not exist
        System.out.println(bookMap.containsKey("Twilight"));

        // Update author of a book
        bookMap.put("Clean Code", "Robert C. Martin");

        // Display updated map
        System.out.println(bookMap);

        // Remove one book
        bookMap.remove("Atomic Habits");

        // Display after removal
        System.out.println(bookMap);

        // Display size of map
        System.out.println(bookMap.size());
    }
}