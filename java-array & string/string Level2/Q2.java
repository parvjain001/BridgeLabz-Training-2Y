import java.util.*;

public class Q2 {
    static String[] splitWords(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int idx = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words[idx++] = temp;
                temp = "";
            } else {
                temp += s.charAt(i);
            }
        }
        words[idx] = temp;
        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] a = splitWords(s);
        String[] b = s.split(" ");

        System.out.println(compare(a, b));
        sc.close();
    }
}