import java.util.HashMap;
import java.util.Map;

public class EmployeeKeysValuesDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(801, "Ali Khan");
        employeeMap.put(802, "Sara Ahmed");
        employeeMap.put(803, "Omar Hassan");
        employeeMap.put(804, "Fatima Noor");
        employeeMap.put(805, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Display all keys (employee IDs)
        System.out.println("\n--- Employee IDs (Keys) ---");
        for (Integer id : employeeMap.keySet()) {
            System.out.println(id);
        }

        // 5. Display all values (employee names)
        System.out.println("\n--- Employee Names (Values) ---");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }

        // 6. Add one more employee record
        employeeMap.put(806, "Aisha Malik");

        // 7. Display updated keys
        System.out.println("\n--- Updated Employee IDs ---");
        for (Integer id : employeeMap.keySet()) {
            System.out.println(id);
        }

        // 8. Display updated values
        System.out.println("\n--- Updated Employee Names ---");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}