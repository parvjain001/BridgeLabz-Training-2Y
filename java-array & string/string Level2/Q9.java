import java.util.*;

public class Q9 {
    static String comp() {
        int x = (int)(Math.random() * 3);
        return x == 0 ? "rock" : x == 1 ? "paper" : "scissors";
    }

    static int win(String u, String c) {
        if (u.equals(c)) return 0;
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper"))) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int uw = 0, cw = 0;

        for (int i = 0; i < n; i++) {
            String u = sc.next();
            String c = comp();

            int res = win(u, c);
            if (res == 1) uw++;
            else if (res == -1) cw++;
        }

        System.out.println(uw + " " + cw);
        sc.close();
    }
}