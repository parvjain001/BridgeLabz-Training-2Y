package level3;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static boolean isPalindromeCharArray(String str) {
        int len = str.length();
        char[] original = str.toCharArray();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = str.charAt(len - 1 - i);
        }
        for (int i = 0; i < len; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("Using Iterative Method: " + (isPalindromeIterative(input) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursive Method: " + (isPalindromeRecursive(input, 0, input.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Char Array Method: " + (isPalindromeCharArray(input) ? "Palindrome" : "Not Palindrome"));
        sc.close();
    }
}
