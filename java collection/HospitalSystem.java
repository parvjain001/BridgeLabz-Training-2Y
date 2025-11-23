import java.util.*;

class Patient {
    String name;
    Patient(String name) { this.name = name; }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        return name.equals(((Patient)o).name);
    }
    public int hashCode() { return Objects.hash(name); }
    public String toString() { return name; }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waiting = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient p1 = new Patient("Parv");
        Patient p2 = new Patient("Aman");

        if (admitted.add(p1)) waiting.add(p1);
        if (admitted.add(p2)) waiting.add(p2);

        while (!waiting.isEmpty()) {
            Patient p = waiting.poll();
            discharged.push(p);
            history.add(p);
        }

        if (!discharged.isEmpty()) {
            Patient recent = discharged.pop();
            admitted.add(recent);
            waiting.add(recent);
        }
    }
}
