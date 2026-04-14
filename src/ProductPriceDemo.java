
import java.util.HashMap;
import java.util.Map;

public class ProductPriceDemo {

    public static void main(String[] args) {

        // 1. Declare a HashMap (Product Name -> Product Price)
        HashMap<String, Double> productPrices = new HashMap<>();

        // 2. Add product records using put()
        productPrices.put("Apple", 0.50);
        productPrices.put("Banana", 0.30);
        productPrices.put("Milk", 1.20);
        productPrices.put("Bread", 1.00);
        productPrices.put("Rice", 2.50);

        // 3. Display all products
        System.out.println("--- Product List ---");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " -> Price: " + entry.getValue());
        }

        // 4. Get price of one specific product
        System.out.println("\nPrice of Milk: " + productPrices.get("Milk"));

        // 5. Check if a product exists
        boolean exists = productPrices.containsKey("Bread");
        System.out.println("Does Bread exist? " + exists);

        // 6. Update price of one product using put()
        productPrices.put("Milk", 1.50);

        // 7. Display updated HashMap
        System.out.println("\n--- After Price Update ---");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " -> Price: " + entry.getValue());
        }

        // 8. Remove one product
        productPrices.remove("Banana");

        // 9. Display after removal
        System.out.println("\n--- After Removing Banana ---");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " -> Price: " + entry.getValue());
        }

        // 10. Display total number of products left
        System.out.println("\nTotal Products Left: " + productPrices.size());
    }
}