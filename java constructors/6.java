class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.costPerDay = 1000.0;
    }
    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
    void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        r1.displayRental();

        System.out.println();

        CarRental r2 = new CarRental("Parv Jain", "SUV", 5, 2500.0);
        r2.displayRental();
    }
}
