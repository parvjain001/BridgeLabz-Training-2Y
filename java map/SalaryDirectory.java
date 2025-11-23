import java.util.*;

public class SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> sal = new HashMap<>();

        sal.put("Parv", 50000.0);
        sal.put("Aman", 45000.0);
        sal.put("Riya", 52000.0);
        sal.put("Neha", 47000.0);
        sal.put("Tina", 60000.0);
        sal.put("Sahil", 55000.0);

        String emp = "Riya";
        if (sal.containsKey(emp))
            sal.put(emp, sal.get(emp) * 1.10);
        else
            System.out.println("Employee not found");

        emp = "Neha";
        if (sal.containsKey(emp))
            sal.put(emp, sal.get(emp) * 1.05);
        else
            System.out.println("Employee not found");

        double total = 0;
        for (double s : sal.values()) total += s;
        System.out.println("Average Salary: " + (total / sal.size()));

        double max = 0;
        for (double s : sal.values()) if (s > max) max = s;

        for (String name : sal.keySet()) {
            if (sal.get(name) == max)
                System.out.println("Highest Paid: " + name + " : " + sal.get(name));
        }
    }
}
