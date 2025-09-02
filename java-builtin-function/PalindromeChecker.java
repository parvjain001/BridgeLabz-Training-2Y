import java.util.Scanner;
public class PalindromeChecker {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = takeInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }
    public static String takeInput() {
        System.out.print("Enter a string: ");
        return sc.nextLine().replaceAll("[\\W_]", "").toLowerCase();
    }
    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
