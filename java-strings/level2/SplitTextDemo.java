package level2;

import java.util.Scanner;

public class SplitTextDemo {

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

    public static String[] splitTextCharAt(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            String word = "";
            for (int j = start; j < spaceIndexes[i]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = spaceIndexes[i] + 1;
        }

        String lastWord = "";
        for (int i = start; i < length; i++) {
            lastWord += text.charAt(i);
        }
        words[wordCount - 1] = lastWord;

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] wordsCharAt = splitTextCharAt(text);
        String[] wordsBuiltIn = text.split(" ");

        System.out.print("Words using charAt(): ");
        for (String word : wordsCharAt) System.out.print(word + " ");
        System.out.println();

        System.out.print("Words using split(): ");
        for (String word : wordsBuiltIn) System.out.print(word + " ");
        System.out.println();

        boolean result = compareStringArrays(wordsCharAt, wordsBuiltIn);
        System.out.println("Both methods give the same result: " + result);
        sc.close();
    }
}
