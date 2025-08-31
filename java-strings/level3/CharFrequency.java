package level3;

import java.util.Scanner;

public class CharFrequency {

    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256];
        int len = 0;

        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {}

        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (freq[str.charAt(i)] != 0) {
                uniqueCount++;
                freq[str.charAt(i)] = -freq[str.charAt(i)];
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            int f = -freq[str.charAt(i)];
            if (f > 0) {
                result[index][0] = String.valueOf(str.charAt(i));
                result[index][1] = String.valueOf(f);
                index++;
                freq[str.charAt(i)] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencies = findCharFrequency(input);
        System.out.println("Character | Frequency");
        for (String[] pair : frequencies) {
            System.out.printf("%-9s | %s%n", pair[0], pair[1]);
        }
        sc.close();
    }
}
