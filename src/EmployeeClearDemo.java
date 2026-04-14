import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeClearDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(601, "Ali Khan");
        employeeMap.put(602, "Sara Ahmed");
        employeeMap.put(603, "Omar Hassan");
        employeeMap.put(604, "Fatima Noor");
        employeeMap.put(605, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Display number of records before clearing
        System.out.println("\nTotal Employees before clear: " + employeeMap.size());

        // 5. Clear all elements from the HashMap
        employeeMap.clear();

        // 6. Display HashMap after clearing (should be empty)
        System.out.println("\n--- After Clearing HashMap ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 7. Confirm the map is empty using size()
        System.out.println("\nTotal Employees after clear: " + employeeMap.size());

        // 8. Print confirmation message
        System.out.println("All employee records have been removed.");
    }
}
