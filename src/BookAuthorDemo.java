import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo {
    public static void main(String[] args) {

        HashMap<String, String> bookMap = new HashMap<>();

        bookMap.put("Harry Potter", "J.K. Rowling");
        bookMap.put("The Hobbit", "J.R.R. Tolkien");
        bookMap.put("Atomic Habits", "James Clear");
        bookMap.put("The Alchemist", "Paulo Coelho");
        bookMap.put("Clean Code", "Robert Martin");

        System.out.println(bookMap);

        System.out.println(bookMap.get("The Hobbit"));

        System.out.println(bookMap.containsKey("Harry Potter"));

        bookMap.put("The Hobbit", "John Tolkien");

        System.out.println(bookMap);

        bookMap.remove("Atomic Habits");

        System.out.println(bookMap);

        System.out.println(bookMap.size());
    }
}