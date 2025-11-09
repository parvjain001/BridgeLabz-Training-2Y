import java.time.LocalDate;

class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}
class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}
public class VehicleMaintenanceTracker {
    private String vehicleName;
    private LocalDate lastServiceDate;
    private int mileage;

    public VehicleMaintenanceTracker(String name, LocalDate lastServiceDate, int mileage) {
        this.vehicleName = name;
        this.lastServiceDate = lastServiceDate;
        this.mileage = mileage;
    }
    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        LocalDate today = LocalDate.now();

        if (mileage < 0)
            throw new InvalidMileageException("Invalid mileage reading detected!");

        if (lastServiceDate.isBefore(today.minusMonths(6)))
            throw new ServiceOverdueException("Service overdue! Please service your vehicle immediately.");

        System.out.println("✅ Vehicle " + vehicleName + " is in good condition.");
    }
    public static void main(String[] args) {
        VehicleMaintenanceTracker car = new VehicleMaintenanceTracker("Honda City", LocalDate.of(2024, 3, 10), 12000);

        try {
            car.checkMaintenance();
        } catch (ServiceOverdueException e) {
            System.out.println("⚠️ " + e.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println("⚠️ " + e.getMessage());
        } finally {
            System.out.println("🚗 Maintenance check complete.");
        }
    }
}
