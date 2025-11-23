import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();

        String[] students = {"Parv", "Aman", "Riya", "Neha", "Tina"};
        for (String s : students) attendance.put(s, 0);

        List<List<String>> days = new ArrayList<>();
        days.add(Arrays.asList("Parv", "Riya"));
        days.add(Arrays.asList("Aman", "Neha"));
        days.add(Arrays.asList("Parv", "Aman", "Tina"));
        days.add(Arrays.asList("Riya", "Neha"));
        days.add(Arrays.asList("Parv"));
        days.add(Arrays.asList("Tina", "Riya"));
        days.add(Arrays.asList("Aman"));
        days.add(Arrays.asList("Parv", "Neha"));
        days.add(Arrays.asList("Tina"));
        days.add(Arrays.asList("Parv", "Riya"));
        days.add(Arrays.asList("Neha", "Aman"));
        days.add(Arrays.asList("Parv", "Tina"));
        days.add(Arrays.asList("Riya"));
        days.add(Arrays.asList("Neha", "Parv"));
        days.add(Arrays.asList("Aman", "Riya"));

        for (List<String> present : days) {
            for (String name : present) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }

        for (String name : attendance.keySet()) {
            if (attendance.get(name) < 10) {
                System.out.println(name + " : " + attendance.get(name));
            }
        }
    }
}
