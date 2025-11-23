import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = sentence.split(" ");

        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        for (String w : freq.keySet()) {
            System.out.println(w + " : " + freq.get(w));
        }
    }
}
