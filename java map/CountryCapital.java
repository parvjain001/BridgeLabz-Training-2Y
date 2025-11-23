import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> cc = new HashMap<>();

        cc.put("India", "New Delhi");
        cc.put("USA", "Washington DC");
        cc.put("France", "Paris");
        cc.put("Germany", "Berlin");
        cc.put("Japan", "Tokyo");
        cc.put("China", "Beijing");
        cc.put("Brazil", "Brasilia");
        cc.put("Russia", "Moscow");

        String input = "Germany";
        if (cc.containsKey(input))
            System.out.println(cc.get(input));
        else
            System.out.println("Unknown country");

        TreeMap<String, String> sorted = new TreeMap<>(cc);
        for (String c : sorted.keySet()) {
            System.out.println(c + " : " + sorted.get(c));
        }
    }
}
