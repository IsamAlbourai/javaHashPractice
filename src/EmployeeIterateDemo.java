import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeIterateDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(901, "Ali Khan");
        employeeMap.put(902, "Sara Ahmed");
        employeeMap.put(903, "Omar Hassan");
        employeeMap.put(904, "Fatima Noor");
        employeeMap.put(905, "Yusuf Ali");

        // 3. Display the full HashMap
        System.out.println("--- Full HashMap ---");
        System.out.println(employeeMap);

        // 4. Iterate using entrySet() and display each record clearly
        System.out.println("\n--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 5. Add one more employee record
        employeeMap.put(906, "Aisha Malik");

        // 6. Iterate again to display updated records
        System.out.println("\n--- Updated Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}