import java.util.HashMap;
import java.util.Map;

public class ProductPriceDemo2 {
    public static void main(String[] args) {

        HashMap<String, Double> productMap = new HashMap<>();

        // Add product-price records
        productMap.put("Apple", 0.50);
        productMap.put("Banana", 0.30);
        productMap.put("Milk", 1.20);
        productMap.put("Bread", 0.80);
        productMap.put("Eggs", 2.50);

        // Display all products
        System.out.println(productMap);

        // Get price of one product
        System.out.println(productMap.get("Milk"));

        // Check if a product exists
        System.out.println(productMap.containsKey("Bread"));

        // Check a product that does not exist
        System.out.println(productMap.containsKey("Cheese"));

        // Update price of a product
        productMap.put("Eggs", 3.00);

        // Display updated map
        System.out.println(productMap);

        // Remove one product
        productMap.remove("Banana");

        // Display after removal
        System.out.println(productMap);

        // Display size of map
        System.out.println(productMap.size());
    }
}