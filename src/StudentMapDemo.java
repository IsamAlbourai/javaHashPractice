import java.util.HashMap;
import java.util.Map;

public class StudentMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add student records
        studentMap.put(1001, "Ali Khan");
        studentMap.put(1002, "Sara Ahmed");
        studentMap.put(1003, "John Smith");
        studentMap.put(1004, "Emily Brown");
        studentMap.put(1005, "Michael Lee");

        // Display all students
        System.out.println(studentMap);

        // Get one student name using ID
        System.out.println(studentMap.get(1003));

        // Check if a student ID exists
        System.out.println(studentMap.containsKey(1002));

        // Check a student ID that does not exist
        System.out.println(studentMap.containsKey(9999));

        // Update student name
        studentMap.put(1004, "Emma Brown");

        // Display updated map
        System.out.println(studentMap);

        // Remove one student
        studentMap.remove(1001);

        // Display after removal
        System.out.println(studentMap);

        // Display size of map
        System.out.println(studentMap.size());
    }
}
