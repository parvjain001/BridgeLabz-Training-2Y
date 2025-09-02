import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int low = 1, high = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100!");
        System.out.println("I will try to guess it.");

        while (!guessed && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'low', 'high', or 'correct')");
            String feedback = getFeedback();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number!");
                guessed = true;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }
        }
        if (!guessed) {
            System.out.println("Hmm... it seems something went wrong with the feedback.");
        }
    }
    public static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }
    public static String getFeedback() {
        String feedback = sc.nextLine().toLowerCase();
        while (!feedback.equals("low") && !feedback.equals("high") && !feedback.equals("correct")) {
            System.out.println("Please enter 'low', 'high', or 'correct':");
            feedback = sc.nextLine().toLowerCase();
        }
        return feedback;
    }
}
