import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    int id;
    int priority;
    RideRequest(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
    public int compareTo(RideRequest r) {
        return r.priority - this.priority;
    }
    public String toString() {
        return id + " (P" + priority + ")";
    }
}

class Driver {
    int id;
    Driver(int id) {
        this.id = id;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        return id == ((Driver)o).id;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public String toString() {
        return "D" + id;
    }
}

class Ride {
    int rideId;
    Ride(int rideId) {
        this.rideId = rideId;
    }
    public String toString() {
        return "Ride-" + rideId;
    }
}

public class RideSharing {
    public static void main(String[] args) {
        Queue<RideRequest> requestQueue = new LinkedList<>();
        requestQueue.add(new RideRequest(1, 1));
        requestQueue.add(new RideRequest(2, 2));

        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver(101));
        drivers.add(new Driver(102));

        PriorityQueue<RideRequest> priorityRequests = new PriorityQueue<>();
        priorityRequests.add(new RideRequest(3, 5));
        priorityRequests.add(new RideRequest(4, 3));

        List<Ride> rideHistory = new ArrayList<>();

        if (!drivers.isEmpty() && !priorityRequests.isEmpty()) {
            RideRequest r = priorityRequests.poll();
            Driver d = drivers.iterator().next();
            drivers.remove(d);
            rideHistory.add(new Ride(r.id));
        }
    }
}
