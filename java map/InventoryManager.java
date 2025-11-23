import java.util.*;

public class InventoryManager {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        stock.put("Soap", 30);
        stock.put("Shampoo", 15);
        stock.put("Toothpaste", 20);

        stock.put("Soap", stock.get("Soap") - 5);
        stock.put("Shampoo", stock.get("Shampoo") - 15);
        if (stock.get("Shampoo") <= 0) stock.remove("Shampoo");

        stock.put("Soap", stock.get("Soap") + 40);

        String query = "Soap";
        if (stock.containsKey(query)) System.out.println(query + ": " + stock.get(query));
        else System.out.println("not stocked");

        System.out.println("Out of stock:");
        for (String product : Arrays.asList("Soap", "Shampoo", "Toothpaste")) {
            if (!stock.containsKey(product) || stock.get(product) == 0) {
                System.out.println(product);
            }
        }
    }
}
