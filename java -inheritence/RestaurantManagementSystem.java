interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes.");
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}

class Waiter extends Person implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at " + tableCount + " tables.");
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Assigned Tables: " + tableCount);
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi Kumar", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Amit Singh", 102, 5);

        chef.displayRole();
        chef.performDuties();
        System.out.println();
        waiter.displayRole();
        waiter.performDuties();
    }
}
