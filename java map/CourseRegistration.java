import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> reg = new HashMap<>();

        reg.put("CS101", 45);
        reg.put("CS102", 10);
        reg.put("CS201", 3);
        reg.put("CS301", 52);
        reg.put("CS205", 4);

        reg.put("CS101", reg.get("CS101") + 7);
        reg.put("CS201", Math.max(0, reg.get("CS201") - 2));
        reg.put("CS205", reg.get("CS205") + 6);

        System.out.println("Near full:");
        for (String c : reg.keySet()) {
            if (reg.get(c) >= 50)
                System.out.println(c + " : " + reg.get(c));
        }

        System.out.println("Under-subscribed:");
        for (String c : reg.keySet()) {
            if (reg.get(c) < 5)
                System.out.println(c + " : " + reg.get(c));
        }
    }
}
