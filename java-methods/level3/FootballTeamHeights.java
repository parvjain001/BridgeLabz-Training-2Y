package level3;

import java.util.Random;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        
        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }
    
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }
    
    public static double findMean(int sum, int n) {
        return (double) sum / n;
    }
    
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }
    
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }
}
