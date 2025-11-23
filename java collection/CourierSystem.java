import java.util.*;

class Parcel implements Comparable<Parcel> {
    String id;
    int priority;
    Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }
    public int compareTo(Parcel p) { return p.priority - this.priority; }
    public String toString() { return id + "(P" + priority + ")"; }
}

public class CourierSystem {
    public static void main(String[] args) {
        PriorityQueue<Parcel> priorityParcels = new PriorityQueue<>();
        Queue<Parcel> normalParcels = new LinkedList<>();
        Set<String> assignedIDs = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        Parcel p1 = new Parcel("D1", 5);
        Parcel p2 = new Parcel("D2", 2);
        Parcel p3 = new Parcel("D1", 5);

        if (assignedIDs.add(p1.id)) priorityParcels.add(p1);
        if (assignedIDs.add(p2.id)) normalParcels.add(p2);
        assignedIDs.add(p3.id);

        while (!priorityParcels.isEmpty()) completed.add(priorityParcels.poll());
        while (!normalParcels.isEmpty()) completed.add(normalParcels.poll());
    }
}
