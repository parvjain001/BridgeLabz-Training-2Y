import java.util.*;

class Package {
    String id;
    String item;
    Package(String id, String item) {
        this.id = id;
        this.item = item;
    }
    public String toString() { return id + " - " + item; }
}

public class WarehouseSystem {
    public static void main(String[] args) {
        Queue<Package> pending = new LinkedList<>();
        pending.add(new Package("P1", "Laptop"));
        pending.add(new Package("P2", "Mobile"));

        Set<String> packageIDs = new HashSet<>();

        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        while (!pending.isEmpty()) {
            Package p = pending.poll();
            if (packageIDs.add(p.id)) {
                if (p.id.equals("P2")) returned.push(p);
                else delivered.add(p);
            }
        }
    }
}
