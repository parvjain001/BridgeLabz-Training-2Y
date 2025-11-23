import java.util.*;

public class EmployeeDept {
    public static void main(String[] args) {
        Map<Integer, String> emp = new HashMap<>();

        emp.put(101, "IT");
        emp.put(102, "HR");
        emp.put(103, "Finance");
        emp.put(104, "IT");
        emp.put(105, "Marketing");

        emp.put(103, "HR");

        String dept = "IT";
        for (Integer id : emp.keySet()) {
            if (emp.get(id).equals(dept))
                System.out.println(id);
        }

        Map<String, Integer> count = new HashMap<>();
        for (String d : emp.values())
            count.put(d, count.getOrDefault(d, 0) + 1);

        for (String d : count.keySet())
            System.out.println(d + " : " + count.get(d));
    }
}
