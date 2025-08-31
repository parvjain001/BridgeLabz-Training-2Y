package level3;

import java.util.*;

public class NumberChecker3 {
    public static void main(String[] args) {
        int number = 12321;

        int count = countDigits(number);
        int[] digits = storeDigits(number, count);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        System.out.println("Arrays Equal: " + arraysEqual(digits, reversed));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int num, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}

