import java.util.*;

public class Q5 {
    static char[] unique(String s) {
        char[] temp = new char[s.length()];
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) found = true;
            }
            if (!found) temp[idx++] = s.charAt(i);
        }
        return Arrays.copyOf(temp, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] u = unique(s);

        for (char c : u) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) count++;
            }
            System.out.println(c + " " + count);
        }
        sc.close();
    }
}