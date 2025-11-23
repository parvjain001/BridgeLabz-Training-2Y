import java.util.*;

class Product {
    String name;
    double price;
    int stock;
    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String toString() {
        return name + " (" + stock + ")";
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockHistory = new Stack<>();

        Product p1 = new Product("Milk", 40, 2);
        Product p2 = new Product("Bread", 20, 10);
        Product p3 = new Product("Eggs", 60, 1);

        if (productNames.add(p1.name)) products.add(p1);
        if (productNames.add(p2.name)) products.add(p2);
        if (productNames.add(p3.name)) products.add(p3);

        for (Product p : products)
            if (p.stock <= 3) restockQueue.add(p);

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restockHistory.push(p);
        }

        if (!restockHistory.isEmpty()) {
            Product last = restockHistory.pop();
            last.stock -= 10;
        }
    }
}
