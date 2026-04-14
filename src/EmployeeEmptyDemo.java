import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeEmptyDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Check if the HashMap is empty before adding records
        System.out.println("--- Check Before Adding Records ---");
        System.out.println("Is employee map empty? " + employeeMap.isEmpty());

        // 3. Add employee records using put()
        employeeMap.put(1101, "Ali Khan");
        employeeMap.put(1102, "Sara Ahmed");
        employeeMap.put(1103, "Omar Hassan");
        employeeMap.put(1104, "Fatima Noor");
        employeeMap.put(1105, "Yusuf Ali");

        // 4. Display all elements in the HashMap
        System.out.println("\n--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 5. Check if the HashMap is empty after adding records
        System.out.println("\nIs employee map empty after adding records? " + employeeMap.isEmpty());

        // 6. Clear all employee records
        employeeMap.clear();

        // 7. Display HashMap after clearing (should be empty)
        System.out.println("\n--- After Clearing HashMap ---");
        System.out.println(employeeMap);

        // 8. Final check using isEmpty()
        System.out.println("\nIs employee map empty after clear? " + employeeMap.isEmpty());
    }
}