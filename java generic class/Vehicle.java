import java.util.*;

class Vehicle {
    String name;
    Vehicle(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Truck extends Vehicle {
    Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    void showFleet() {
        for (T v : fleet) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Volvo Truck"));
        truckFleet.addVehicle(new Truck("Tata Truck"));
        System.out.println("Truck Fleet:");
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Yamaha Bike"));
        bikeFleet.addVehicle(new Bike("Royal Enfield"));
        System.out.println("Bike Fleet:");
        bikeFleet.showFleet();
    }
}
