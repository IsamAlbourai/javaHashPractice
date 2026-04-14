import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeUpdateDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(701, "Ali Khan");
        employeeMap.put(702, "Sara Ahmed");
        employeeMap.put(703, "Omar Hassan");
        employeeMap.put(704, "Fatima Noor");
        employeeMap.put(705, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Update an existing employee's name using the same key
        employeeMap.put(703, "Omar Ali"); // Updated name

        // 5. Display the updated HashMap
        System.out.println("\n--- After Updating ID 703 ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 6. Use get() to show the updated value
        String updatedEmployee = employeeMap.get(703);
        System.out.println("\nUpdated name for ID 703: " + updatedEmployee);

        // 7. Update another employee record
        employeeMap.put(702, "Sara Ali"); // Updated name

        // 8. Display the map again after second update
        System.out.println("\n--- After Updating ID 702 ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}