import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int minLength = Math.min(str1.length(), str2.length());
        boolean decided = false;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                decided = true;
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
                decided = true;
                break;
            }
        }

        if (!decided) {
            if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else if (str1.length() > str2.length()) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
        sc.close();
    }
}
