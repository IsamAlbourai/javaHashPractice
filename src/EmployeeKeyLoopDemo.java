import java.util.HashMap;

public class EmployeeKeyLoopDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(1201, "Ali Khan");
        employeeMap.put(1202, "Sara Ahmed");
        employeeMap.put(1203, "Omar Hassan");
        employeeMap.put(1204, "Fatima Noor");
        employeeMap.put(1205, "Yusuf Ali");

        // 3. Display full HashMap
        System.out.println("--- Full HashMap ---");
        System.out.println(employeeMap);

        // 4. Get all keys using keySet()
        System.out.println("\n--- Employee Records (Using keySet + get) ---");

        // 5. Loop through each key and print key-value pair
        for (Integer id : employeeMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employeeMap.get(id));
        }

        // 6. Add one more employee record
        employeeMap.put(1206, "Aisha Malik");

        // 7. Display updated records
        System.out.println("\n--- Updated Employee Records ---");

        // 8. Repeat loop after update
        for (Integer id : employeeMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employeeMap.get(id));
        }
    }
}
