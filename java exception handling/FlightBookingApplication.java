class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String message) {
        super(message);
    }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}
public class FlightBookingApplication {

    public static void checkSeatAvailability() throws SeatUnavailableException {
        boolean seatFull = Math.random() < 0.5;
        if (seatFull) {
            throw new SeatUnavailableException("No seats available for the selected flight.");
        }
    }
    public static void processPayment() throws PaymentFailedException {
        boolean paymentFail = Math.random() < 0.5;
        if (paymentFail) {
            throw new PaymentFailedException("Payment failed! Please try again.");
        }
    }
    public static void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
        System.out.println("✅ Ticket booked successfully!");
    }
    public static void main(String[] args) {
        try {
            bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println("❌ Booking error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("❌ Payment error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Unknown error: " + e.getMessage());
        } finally {
            System.out.println("🛫 Thank you for booking with us!");
        }
    }
}
