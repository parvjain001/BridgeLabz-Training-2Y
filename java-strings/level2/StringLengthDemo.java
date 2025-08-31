package level2;

import java.util.Scanner;

public class StringLengthDemo {

    public static int findLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int lengthCustom = findLength(input);
        int lengthBuiltIn = input.length();

        System.out.println("Length using user-defined method: " + lengthCustom);
        System.out.println("Length using built-in length(): " + lengthBuiltIn);
        sc.close();
    }
}

