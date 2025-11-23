import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        grades.put("Parv", 85.0);
        grades.put("Aman", 92.0);
        grades.put("Riya", 78.5);
        grades.put("Neha", 88.0);

        grades.put("Riya", 90.0);

        grades.remove("Aman");

        TreeMap<String, Double> sorted = new TreeMap<>(grades);

        for (String name : sorted.keySet()) {
            System.out.println(name + " : " + sorted.get(name));
        }
    }
}
