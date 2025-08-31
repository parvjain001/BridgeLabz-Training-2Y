package level2;

import java.util.Scanner;

public class TrimSpacesDemo {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    public static String substringCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] trimIndexes = findTrimIndexes(text);
        String trimmedCharAt = substringCharAt(text, trimIndexes[0], trimIndexes[1]);
        String trimmedBuiltIn = text.trim();

        System.out.println("Trimmed using charAt(): '" + trimmedCharAt + "'");
        System.out.println("Trimmed using built-in trim(): '" + trimmedBuiltIn + "'");

        boolean isEqual = compareStringsCharAt(trimmedCharAt, trimmedBuiltIn);
        System.out.println("Both trimming methods give the same result: " + isEqual);
        sc.close();
    }
}
