class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-11-01");
        ShippedOrder shipped = new ShippedOrder(102, "2025-11-02", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(103, "2025-11-03", "TRK67890", "2025-11-05");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
