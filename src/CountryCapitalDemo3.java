import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo3 {
    public static void main(String[] args) {

        HashMap<String, String> countryMap = new HashMap<>();

        // Add country-capital records
        countryMap.put("France", "Paris");
        countryMap.put("Germany", "Berlin");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Canada", "Ottawa");

        // Display all countries
        System.out.println(countryMap);

        // Get capital of one country
        System.out.println(countryMap.get("Japan"));

        // Check if a country exists
        System.out.println(countryMap.containsKey("France"));

        // Check a country that does not exist
        System.out.println(countryMap.containsKey("Brazil"));

        // Update capital of a country
        countryMap.put("Germany", "Berlin City");

        // Display updated map
        System.out.println(countryMap);

        // Remove one country
        countryMap.remove("Canada");

        // Display after removal
        System.out.println(countryMap);

        // Display size of map
        System.out.println(countryMap.size());
    }
}
