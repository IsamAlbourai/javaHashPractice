import java.util.HashMap;
import java.util.Map; // Needed for entrySet()

public class EmployeeHashMapDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(101, "Ali Khan");
        employeeMap.put(102, "Sara Ahmed");
        employeeMap.put(103, "Omar Hassan");
        employeeMap.put(104, "Fatima Noor");
        employeeMap.put(105, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Add one more employee record
        employeeMap.put(106, "Aisha Malik");

        // 5. Display updated HashMap
        System.out.println("\n--- Updated Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }
    }
}
