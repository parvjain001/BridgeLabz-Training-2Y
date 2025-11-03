interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated (default implementation).");
    }
}

class Paytm implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via Paytm");
    }
}

class GooglePay implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via Google Pay");
    }

    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed via Google Pay");
    }
}

public class Paymentgateway {
    public static void main(String[] args) {
        PaymentProcessor paytm = new Paytm();
        PaymentProcessor gpay = new GooglePay();

        paytm.processPayment(1000);
        paytm.refund(200);

        gpay.processPayment(1500);
        gpay.refund(300);
    }
}
