import java.util.*;

class Order {
    int id;
    String item;

    Order(int id, String item) {
        this.id = id;
        this.item = item;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order obj = (Order) o;
        return id == obj.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " - " + item;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, "Shoes"));
        orderList.add(new Order(2, "Phone"));
        orderList.add(new Order(1, "Shoes"));

        Set<Order> uniqueOrders = new HashSet<>(orderList);
        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);

        Stack<Order> failedStack = new Stack<>();

        while (!processingQueue.isEmpty()) {
            Order o = processingQueue.poll();
            if (o.id % 2 == 0) failedStack.push(o);
        }

        while (!failedStack.isEmpty()) {
            Order retry = failedStack.pop();
        }
    }
}
