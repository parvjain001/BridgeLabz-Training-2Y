import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 500.0);
        cart.put("Bag", 1200.0);
        cart.put("Keyboard", 1500.0);

        for (String p : cart.keySet())
            System.out.println(p + " : " + cart.get(p));

        double total = 0;
        for (double price : cart.values()) total += price;

        if (total > 5000) total = total * 0.90;
        System.out.println("Total: " + total);

        cart.remove("Mouse");

        for (String p : cart.keySet())
            System.out.println(p + " : " + cart.get(p));
    }
}
