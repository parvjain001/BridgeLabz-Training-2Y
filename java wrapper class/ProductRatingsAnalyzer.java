import java.util.*;
//import java.util.stream.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {5, 4, 3, 5};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(4, null, 5, 2, null));

        ArrayList<Integer> allRatings = new ArrayList<>();

        for (int rating : oldRatings)
            allRatings.add(rating);

        allRatings.addAll(newRatings);

        double average = allRatings.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("All Ratings: " + allRatings);
        System.out.println("Average Rating: " + average);
    }
}
