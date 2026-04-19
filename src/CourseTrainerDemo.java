import java.util.HashMap;
import java.util.Map;

public class CourseTrainerDemo {
    public static void main(String[] args) {

        HashMap<String, String> courseMap = new HashMap<>();

        // Add course-trainer records
        courseMap.put("Java Basics", "Ali Khan");
        courseMap.put("Python Basics", "Sara Ahmed");
        courseMap.put("Web Development", "John Smith");
        courseMap.put("Data Structures", "Emily Brown");
        courseMap.put("Databases", "Michael Lee");

        // Display all records
        System.out.println(courseMap);

        // Get trainer of one course
        System.out.println(courseMap.get("Java Basics"));

        // Check if course exists
        System.out.println(courseMap.containsKey("Python Basics"));

        // Check a course that does not exist
        System.out.println(courseMap.containsKey("Cyber Security"));

        // Update trainer of a course
        courseMap.put("Web Development", "David Johnson");

        // Display updated map
        System.out.println(courseMap);

        // Remove one course
        courseMap.remove("Databases");

        // Display after removal
        System.out.println(courseMap);

        // Display size of map
        System.out.println(courseMap.size());
    }
}
