import java.util.*;

public class Q1 {
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        boolean res1 = compare(a, b);
        boolean res2 = a.equals(b);

        System.out.println(res1);
        System.out.println(res2);
        sc.close();
    }
}