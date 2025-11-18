import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void removeItem(T item) {
        items.remove(item);
    }

    void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");
        electronicsCart.addItem("Phone");
        System.out.println("Electronics Cart:");
        electronicsCart.displayItems();

        Cart<String> clothingCart = new Cart<>();
        clothingCart.addItem("T-Shirt");
        clothingCart.addItem("Jeans");
        System.out.println("Clothing Cart:");
        clothingCart.displayItems();
    }
}
