package level2;

import java.util.Scanner;

public class ShortestLongestWords {

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

        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += text.charAt(j);
                words[index++] = word;
                start = i + 1;
            }
        }
        String lastWord = "";
        for (int i = start; i < length; i++) lastWord += text.charAt(i);
        words[index] = lastWord;

        return words;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] wordsInfo) {
        int minLen = Integer.parseInt(wordsInfo[0][1]);
        int maxLen = Integer.parseInt(wordsInfo[0][1]);
        String shortest = wordsInfo[0][0];
        String longest = wordsInfo[0][0];

        for (int i = 1; i < wordsInfo.length; i++) {
            int len = Integer.parseInt(wordsInfo[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = wordsInfo[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordsInfo[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitTextCharAt(text);
        String[][] wordsInfo = wordsWithLengths(words);
        String[] result = findShortestLongest(wordsInfo);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
        sc.close();
    }
}

