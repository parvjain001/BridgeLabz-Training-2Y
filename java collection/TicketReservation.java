import java.util.*;

class Booking implements Comparable<Booking> {
    String user;
    boolean vip;
    Booking(String user, boolean vip) {
        this.user = user;
        this.vip = vip;
    }
    public int compareTo(Booking b) {
        return Boolean.compare(b.vip, this.vip);
    }
    public String toString() { return user + (vip ? " (VIP)" : ""); }
}

public class TicketReservation {
    public static void main(String[] args) {
        List<Booking> allBookings = new ArrayList<>();
        Set<String> users = new HashSet<>();

        Queue<Booking> bookingQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>();

        if (users.add("Parv")) bookingQueue.add(new Booking("Parv", false));
        if (users.add("Shreya")) vipQueue.add(new Booking("Shreya", true));
        if (users.add("Parv")) bookingQueue.add(new Booking("Parv", false));

        while (!vipQueue.isEmpty()) allBookings.add(vipQueue.poll());
        while (!bookingQueue.isEmpty()) allBookings.add(bookingQueue.poll());
    }
}
