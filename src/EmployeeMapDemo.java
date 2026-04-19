import java.util.HashMap;
import java.util.Map;

public class EmployeeMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        // Add employee records
        employeeMap.put(101, "Ali Khan");
        employeeMap.put(102, "Sara Ahmed");
        employeeMap.put(103, "John Smith");
        employeeMap.put(104, "Emily Brown");
        employeeMap.put(105, "Michael Lee");

        // Display all records
        System.out.println(employeeMap);

        // Get employee name using ID
        System.out.println(employeeMap.get(103));

        // Check if employee ID exists
        System.out.println(employeeMap.containsKey(102));

        // Check an ID that does not exist
        System.out.println(employeeMap.containsKey(999));

        // Update employee name
        employeeMap.put(104, "Emma Brown");

        // Display updated map
        System.out.println(employeeMap);

        // Remove one employee
        employeeMap.remove(101);

        // Display after removal
        System.out.println(employeeMap);

        // Display size of map
        System.out.println(employeeMap.size());
    }
}