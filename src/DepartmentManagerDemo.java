import java.util.HashMap;
import java.util.Map;

public class DepartmentManagerDemo {
    public static void main(String[] args) {

        HashMap<String, String> departmentMap = new HashMap<>();

        // Add department-manager records
        departmentMap.put("HR", "Alice Johnson");
        departmentMap.put("IT", "John Smith");
        departmentMap.put("Finance", "Michael Lee");
        departmentMap.put("Marketing", "Sara Ahmed");
        departmentMap.put("Sales", "David Brown");

        // Display all departments
        System.out.println(departmentMap);

        // Get manager of one department
        System.out.println(departmentMap.get("IT"));

        // Check if a department exists
        System.out.println(departmentMap.containsKey("HR"));

        // Check a department that does not exist
        System.out.println(departmentMap.containsKey("Operations"));

        // Update manager of a department
        departmentMap.put("Marketing", "Emma Wilson");

        // Display updated map
        System.out.println(departmentMap);

        // Remove one department
        departmentMap.remove("Sales");

        // Display after removal
        System.out.println(departmentMap);

        // Display size of map
        System.out.println(departmentMap.size());
    }
}
