package level2;

import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotal() {
        return price * quantity;
    }
}
class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();
    void addItem(String name, double price, int quantity) {
        items.add(new CartItem(name, price, quantity));
        System.out.println(quantity + " x " + name + " added to cart.");
    }
    void removeItem(String name) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(name)) {
                items.remove(i);
                System.out.println(name + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(name + " not found in cart.");
        }
    }
    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotal();
        }
        System.out.println("Total Cost: " + total);
    }
}
public class Shopping_cart_simulation {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Notebook", 50, 2);
        cart.addItem("Pen", 10, 5);
        cart.displayTotalCost();
        cart.removeItem("Pen");
        cart.displayTotalCost();
    }
}

