import java.util.HashMap;
import java.util.Map;

public class MovieDirectorDemo {
    public static void main(String[] args) {

        HashMap<String, String> movieMap = new HashMap<>();

        // Add movie-director records
        movieMap.put("Inception", "Christopher Nolan");
        movieMap.put("Titanic", "James Cameron");
        movieMap.put("Avatar", "James Cameron");
        movieMap.put("Interstellar", "Christopher Nolan");
        movieMap.put("The Godfather", "Francis Ford Coppola");

        // Display all records
        System.out.println(movieMap);

        // Get director of one movie
        System.out.println(movieMap.get("Inception"));

        // Check if movie exists
        System.out.println(movieMap.containsKey("Titanic"));

        // Check a movie that does not exist
        System.out.println(movieMap.containsKey("Spider Man"));

        // Update director of a movie
        movieMap.put("Avatar", "Cameron James");

        // Display updated map
        System.out.println(movieMap);

        // Remove one movie
        movieMap.remove("The Godfather");

        // Display after removal
        System.out.println(movieMap);

        // Display size of map
        System.out.println(movieMap.size());
    }
}