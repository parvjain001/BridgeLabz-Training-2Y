class Product implements Cloneable {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Cloningprototype {
    public static void main(String[] args) {
        try {
            Product original = new Product("Laptop", 75000);
            Product copy = (Product) original.clone();

            System.out.println("Original Product: " + original.name + " - ₹" + original.price);
            System.out.println("Cloned Product: " + copy.name + " - ₹" + copy.price);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
