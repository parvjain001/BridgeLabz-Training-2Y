package level3;

import java.util.*;

public class NumberChecker2 {
    public static void main(String[] args) {
        int number = 1729;

        int count = countDigits(number);
        int[] digits = storeDigits(number, count);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);
        System.out.println("Digits: " + Arrays.toString(digits));
        
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        System.out.println("Is Harshad Number: " + isHarshadNumber(number, sum));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : freq) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + " -> " + row[1] + " times");
            }
        }
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num, int sum) {
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }
}

