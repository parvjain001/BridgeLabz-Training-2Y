class Product<T> {
    String name;
    double price;
    T category;
    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return name + " (" + category + ") - ₹" + price;
    }
}
class BookCategory {
    String type = "Book";
    public String toString() {
        return type;
    }
}
class ClothingCategory {
    String type = "Clothing";
    public String toString() {
        return type;
    }
}
class GadgetCategory {
    String type = "Gadget";
    public String toString() {
        return type;
    }
}
class Marketplace {
    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(newPrice);
    }
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 1200, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 25000, new GadgetCategory());

        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(phone, 15);
        System.out.println("\nAfter Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
