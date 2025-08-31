import java.util.Scanner;

public class UppercaseConversion {

    public static String toUpperCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
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

        String upperCharAt = toUpperCharAt(text);
        String upperBuiltIn = text.toUpperCase();

        System.out.println("Uppercase using charAt(): " + upperCharAt);
        System.out.println("Uppercase using built-in toUpperCase(): " + upperBuiltIn);

        boolean result = compareStringsCharAt(upperCharAt, upperBuiltIn);
        System.out.println("Both uppercase conversions are equal: " + result);
        sc.close();
    }
}
