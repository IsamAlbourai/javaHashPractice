import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeCheckDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(301, "Ali Khan");
        employeeMap.put(302, "Sara Ahmed");
        employeeMap.put(303, "Omar Hassan");
        employeeMap.put(304, "Fatima Noor");
        employeeMap.put(305, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Check if a specific employee ID exists using containsKey()
        boolean hasID1 = employeeMap.containsKey(302);
        System.out.println("\nDoes ID 302 exist? " + hasID1);

        // 5. Check another ID that does NOT exist
        boolean hasID2 = employeeMap.containsKey(999);
        System.out.println("Does ID 999 exist? " + hasID2);

        // 6. Check if a specific employee name exists using containsValue()
        boolean hasName1 = employeeMap.containsValue("Sara Ahmed");
        System.out.println("\nDoes 'Sara Ahmed' exist? " + hasName1);

        // 7. Check another name that does NOT exist
        boolean hasName2 = employeeMap.containsValue("John Doe");
        System.out.println("Does 'John Doe' exist? " + hasName2);
    }
}