import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    protected void setCurrentLocation(String location) { this.currentLocation = location; }
    protected String getLocation() { return currentLocation; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // base fare
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
        System.out.println("Car location updated to: " + newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
        System.out.println("Bike location updated to: " + newLocation);
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // small base fare
    }

    public String getCurrentLocation() {
        return getLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
        System.out.println("Auto location updated to: " + newLocation);
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        rides.add(new Car("C101", "Ravi", 15, "Sector 10"));
        rides.add(new Bike("B202", "Sita", 8, "MG Road"));
        rides.add(new Auto("A303", "Mohan", 10, "Railway Station"));

        calculateRides(rides, 12.5);
    }

    public static void calculateRides(List<Vehicle> rides, double distance) {
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: ₹" + fare);
            ((GPS) v).updateLocation("Customer Drop Point");
            System.out.println();
        }
    }
}
