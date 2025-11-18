import java.util.*;

class Fruit {
    String name;
    Fruit(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    Mango() {
        super("Mango");
    }
}

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    void add(T fruit) {
        fruits.add(fruit);
    }
    void display() {
        for (T fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();
    }
}
