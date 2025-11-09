import java.util.HashMap;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}
class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}
public class MovieTicketBooking {
    private static HashMap<String, Boolean> seats = new HashMap<>();

    static {
        // Initialize seats
        seats.put("A1", false);
        seats.put("A2", false);
        seats.put("A3", false);
        seats.put("A4", false);
        seats.put("B1", false);
    }

    public static void bookSeat(String seatNumber) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNumber)) {
            throw new InvalidSeatException("Invalid seat number: " + seatNumber);
        }

        if (seats.get(seatNumber)) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked!");
        }

        seats.put(seatNumber, true);
        System.out.println("✅ Seat " + seatNumber + " booked successfully!");
    }

    public static void main(String[] args) {
        try {
            bookSeat("A2");
            bookSeat("A2"); 
        } catch (InvalidSeatException e) {
            System.out.println("❌ " + e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.out.println("❌ " + e.getMessage());
        } finally {
            System.out.println("🎟️ Booking process completed.");
        }
    }
}
