import java.util.*;

public class Q7 {
    static String trim(String s) {
        int start = 0, end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        String res = "";
        for (int i = start; i <= end; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String a = trim(s);
        String b = s.trim();

        System.out.println(a.equals(b));
        sc.close();
    }
}