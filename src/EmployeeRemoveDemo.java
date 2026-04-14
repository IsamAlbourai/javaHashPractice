import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeRemoveDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(401, "Ali Khan");
        employeeMap.put(402, "Sara Ahmed");
        employeeMap.put(403, "Omar Hassan");
        employeeMap.put(404, "Fatima Noor");
        employeeMap.put(405, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Remove one employee using their ID
        employeeMap.remove(403); // Removing Omar Hassan

        // 5. Display HashMap after removal
        System.out.println("\n--- After Removing ID 403 ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 6. Remove another employee
        employeeMap.remove(401); // Removing Ali Khan

        // 7. Display updated HashMap again
        System.out.println("\n--- After Removing ID 401 ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 8. Attempt to remove an ID that does NOT exist
        employeeMap.remove(999); // No such ID

        // 9. Display HashMap again (no change expected)
        System.out.println("\n--- After Attempting to Remove ID 999 ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}