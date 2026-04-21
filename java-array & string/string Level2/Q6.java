import java.util.*;

public class Q6 {
    static String type(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + " " + type(s.charAt(i)));
        }
        sc.close();
    }
}