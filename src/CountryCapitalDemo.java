import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap (Country -> Capital City)
        HashMap<String, String> countryCapitalMap = new HashMap<>();

        // 2. Add country-capital records using put()
        countryCapitalMap.put("Oman", "Muscat");
        countryCapitalMap.put("UAE", "Abu Dhabi");
        countryCapitalMap.put("Saudi Arabia", "Riyadh");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("France", "Paris");

        // 3. Display all records
        System.out.println("--- Country Capital List ---");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " -> Capital: " + entry.getValue());
        }

        // 4. Get capital of one specific country
        System.out.println("\nCapital of India: " + countryCapitalMap.get("India"));

        // 5. Check if a country exists
        boolean exists = countryCapitalMap.containsKey("Oman");
        System.out.println("Does Oman exist? " + exists);

        // 6. Update capital of one country using put()
        countryCapitalMap.put("France", "Paris City"); // updated value

        // 7. Display updated map
        System.out.println("\n--- After Updating France ---");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " -> Capital: " + entry.getValue());
        }

        // 8. Remove one country record
        countryCapitalMap.remove("UAE");

        // 9. Display after removal
        System.out.println("\n--- After Removing UAE ---");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " -> Capital: " + entry.getValue());
        }

        // 10. Display total number of records left
        System.out.println("\nTotal Countries Left: " + countryCapitalMap.size());
    }
}
