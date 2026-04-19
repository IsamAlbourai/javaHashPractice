import java.util.HashMap;
import java.util.Map;

public class CourseMapDemo {
    public static void main(String[] args) {

        HashMap<String, String> courseMap = new HashMap<>();

        // Add course records
        courseMap.put("CS101", "Introduction to Computer Science");
        courseMap.put("CS102", "Data Structures");
        courseMap.put("CS103", "Databases");
        courseMap.put("CS104", "Web Development");
        courseMap.put("CS105", "Operating Systems");

        // Display all courses
        System.out.println(courseMap);

        // Get one course name using code
        System.out.println(courseMap.get("CS102"));

        // Check if a course code exists
        System.out.println(courseMap.containsKey("CS103"));

        // Check a course code that does not exist
        System.out.println(courseMap.containsKey("CS999"));

        // Update a course name
        courseMap.put("CS104", "Advanced Web Development");

        // Display updated map
        System.out.println(courseMap);

        // Remove one course
        courseMap.remove("CS105");

        // Display after removal
        System.out.println(courseMap);

        // Display size of map
        System.out.println(courseMap.size());
    }
}