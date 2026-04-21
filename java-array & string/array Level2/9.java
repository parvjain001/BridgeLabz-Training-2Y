import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] per = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (per[i] >= 80) grade[i] = 'A';
            else if (per[i] >= 70) grade[i] = 'B';
            else if (per[i] >= 60) grade[i] = 'C';
            else if (per[i] >= 50) grade[i] = 'D';
            else if (per[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + per[i] + " " + grade[i]);
        }
        sc.close();
    }
}