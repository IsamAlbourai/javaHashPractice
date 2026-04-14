import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeGetDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(201, "Ali Khan");
        employeeMap.put(202, "Sara Ahmed");
        employeeMap.put(203, "Omar Hassan");
        employeeMap.put(204, "Fatima Noor");
        employeeMap.put(205, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Retrieve employee name using get() for a specific ID
        String employee1 = employeeMap.get(202); // Get employee with ID 202
        System.out.println("\nEmployee with ID 202: " + employee1);

        // 5. Retrieve another employee name using get()
        String employee2 = employeeMap.get(204); // Get employee with ID 204
        System.out.println("Employee with ID 204: " + employee2);
    }
}
