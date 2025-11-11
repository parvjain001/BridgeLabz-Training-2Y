import java.util.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 32, 41, 29, 38, 22};
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages)
            ageList.add(age);

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Employee ages: " + ageList);
        System.out.println("Youngest employee age: " + youngest);
        System.out.println("Oldest employee age: " + oldest);
    }
}
