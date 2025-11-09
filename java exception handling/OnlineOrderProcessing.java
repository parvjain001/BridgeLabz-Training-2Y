import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}
public class OnlineOrderProcessing {

    public static void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random rand = new Random();
        int situation = rand.nextInt(3); 

        if (situation == 1) {
            throw new OutOfStockException("Product is out of stock!");
        } else if (situation == 2) {
            throw new PaymentFailedException("Payment process failed!");
        } else {
            System.out.println("✅ Order placed successfully!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Processing your order...");
        try {
            placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("❌ " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("❌ " + e.getMessage());
        } finally {
            System.out.println("🛍️ Thank you for shopping with us!");
        }
    }
}
