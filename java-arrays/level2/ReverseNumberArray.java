package level2;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNumber = number;

        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        sc.close();
    }
}

