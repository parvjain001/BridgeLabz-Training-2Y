import java.util.*;
class Product {
    private double price;
    Product(double price) {
        this.price = price;
    }
    double getPrice() {
        return price;
    }
}
class Mobile extends Product {
    Mobile(double price) {
        super(price);
    }
}
class Laptop extends Product {
    Laptop(double price) {
        super(price);
    }
}
class PriceCalculator {
    static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(20000), new Mobile(30000));
        List<Laptop> laptops = Arrays.asList(new Laptop(50000), new Laptop(70000));
        System.out.println("Total Mobile Price: " + calculateTotal(mobiles));
        System.out.println("Total Laptop Price: " + calculateTotal(laptops));
    }
}
