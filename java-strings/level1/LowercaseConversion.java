import java.util.Scanner;

public class LowercaseConversion {

    public static String toLowerCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            result += c;
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
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        String lowerCharAt = toLowerCharAt(text);
        String lowerBuiltIn = text.toLowerCase();

        System.out.println("Lowercase using charAt(): " + lowerCharAt);
        System.out.println("Lowercase using built-in toLowerCase(): " + lowerBuiltIn);

        boolean result = compareStringsCharAt(lowerCharAt, lowerBuiltIn);
        System.out.println("Both lowercase conversions are equal: " + result);
        sc.close();
    }
}
