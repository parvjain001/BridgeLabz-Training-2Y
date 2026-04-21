import java.util.*;

public class Q8 {
    static String[][] check(int[] ages) {
        String[][] res = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }

        String[][] res = check(ages);

        for (String[] r : res) {
            System.out.println(r[0] + " " + r[1]);
        }
        sc.close();
    }
}