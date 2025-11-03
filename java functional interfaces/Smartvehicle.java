interface SmartVehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery information not available for this vehicle.");
    }
}

class Car implements SmartVehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements SmartVehicle {
    public void displaySpeed() {
        System.out.println("Electric Car speed: 60 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery level: 85%");
    }
}

public class Smartvehicle {
    public static void main(String[] args) {
        SmartVehicle car = new Car();
        SmartVehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
