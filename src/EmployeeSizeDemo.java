import java.util.HashMap;
import java.util.Map; // For entrySet()

public class EmployeeSizeDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap with Integer keys (IDs) and String values (names)
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // 2. Add employee records using put()
        employeeMap.put(501, "Ali Khan");
        employeeMap.put(502, "Sara Ahmed");
        employeeMap.put(503, "Omar Hassan");
        employeeMap.put(504, "Fatima Noor");
        employeeMap.put(505, "Yusuf Ali");

        // 3. Display all elements in the HashMap
        System.out.println("--- Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Display total number of employee records using size()
        System.out.println("\nTotal Employees: " + employeeMap.size());

        // 5. Add one more employee record
        employeeMap.put(506, "Aisha Malik");

        // 6. Display updated HashMap
        System.out.println("\n--- Updated Employee Records ---");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 7. Display new total number of employee records
        System.out.println("\nUpdated Total Employees: " + employeeMap.size());
    }
}
