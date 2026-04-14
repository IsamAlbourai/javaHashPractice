import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeCompareUpdateDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(1001, "Ali Khan");
        employeeMap.put(1002, "Sara Ahmed");
        employeeMap.put(1003, "Omar Hassan");
        employeeMap.put(1004, "Fatima Noor");
        employeeMap.put(1005, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Get current value of one employee ID
        System.out.println("\nCurrent name for ID 1003: " + employeeMap.get(1003));

        // 5. Update that employee name using put()
        employeeMap.put(1003, "Omar Ali");

        // 6. Show updated value using get()
        System.out.println("Updated name for ID 1003: " + employeeMap.get(1003));

        // 7. Repeat process for another employee ID
        System.out.println("\nCurrent name for ID 1002: " + employeeMap.get(1002));

        // 8. Update second employee
        employeeMap.put(1002, "Sara Khan");

        // 9. Show updated value
        System.out.println("Updated name for ID 1002: " + employeeMap.get(1002));

        // 10. Display full updated HashMap
        System.out.println("\n--- Final Updated Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}