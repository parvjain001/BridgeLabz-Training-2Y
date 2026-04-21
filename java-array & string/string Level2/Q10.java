import java.util.*;

public class Q10 {
    static String grade(double p) {
        if (p >= 80) return "A";
        else if (p >= 70) return "B";
        else if (p >= 60) return "C";
        else if (p >= 50) return "D";
        else if (p >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int phy = sc.nextInt();
            int chem = sc.nextInt();
            int math = sc.nextInt();

            int total = phy + chem + math;
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            per = Math.round(per * 100.0) / 100.0;

            System.out.println(total + " " + avg + " " + per + " " + grade(per));
        }
        sc.close();
    }
}