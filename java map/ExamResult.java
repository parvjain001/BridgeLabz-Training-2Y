import java.util.*;

public class ExamResult {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> result = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("Parv", 88);
        math.put("Aman", 92);
        math.put("Riya", 76);

        Map<String, Integer> science = new HashMap<>();
        science.put("Parv", 81);
        science.put("Aman", 67);
        science.put("Riya", 95);

        Map<String, Integer> english = new HashMap<>();
        english.put("Parv", 78);
        english.put("Aman", 84);
        english.put("Riya", 91);

        result.put("Math", math);
        result.put("Science", science);
        result.put("English", english);

        for (String subject : result.keySet()) {
            Map<String, Integer> marks = result.get(subject);
            String topper = "";
            int max = 0;
            for (String name : marks.keySet()) {
                if (marks.get(name) > max) {
                    max = marks.get(name);
                    topper = name;
                }
            }
            System.out.println(subject + " Topper: " + topper + " : " + max);
        }

        for (String subject : result.keySet()) {
            Map<String, Integer> marks = result.get(subject);
            int total = 0;
            for (int m : marks.values()) total += m;
            System.out.println(subject + " Average: " + (total / marks.size()));
        }

        for (String subject : result.keySet()) {
            Map<String, Integer> marks = result.get(subject);
            for (int m : marks.values()) {
                if (m > 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }
}
