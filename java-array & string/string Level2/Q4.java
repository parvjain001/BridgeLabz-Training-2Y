import java.util.*;

public class Q4 {
    static int len(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c++);
            }
        } catch (Exception e) {}
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        String min = words[0], max = words[0];

        for (String w : words) {
            if (len(w) < len(min)) min = w;
            if (len(w) > len(max)) max = w;
        }

        System.out.println(min);
        System.out.println(max);
        sc.close();
    }
}