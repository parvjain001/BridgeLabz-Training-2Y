import java.util.*;
//import java.util.stream.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc", null, "76"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object m : marks) {
            try {
                if (m == null) continue;
                if (m instanceof Integer)
                    validMarks.add((Integer) m);
                else if (m instanceof String) {
                    String str = (String) m;
                    if (!str.equalsIgnoreCase("null"))
                        validMarks.add(Integer.parseInt(str));
                }
            } catch (NumberFormatException e) {
            }
        }

        double average = validMarks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Valid Marks: " + validMarks);
        System.out.println("Average Marks: " + average);
    }
}
