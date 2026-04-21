import java.util.*;

public class Q3 {
    static String[] splitWords(String s) {
        String[] arr = s.split(" ");
        return arr;
    }

    static int len(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {}
        return c;
    }

    static String[][] build(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(len(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] res = build(splitWords(s));

        for (String[] row : res) {
            System.out.println(row[0] + " " + row[1]);
        }
        sc.close();
    }
}