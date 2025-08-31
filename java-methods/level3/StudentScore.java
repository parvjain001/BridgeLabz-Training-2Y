package level3;

import java.util.Random;
import java.util.Scanner;

public class StudentScore {
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; 
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + rand.nextInt(61); 
            scores[i][1] = 40 + rand.nextInt(61); 
            scores[i][2] = 40 + rand.nextInt(61); 
        }
        return scores;
    }

    public static double[][] calculateTotals(int[][] scores) {
        double[][] result = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static String getGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-8s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-8s%n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2],
                results[i][0], results[i][1], results[i][2], getGrade(results[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateTotals(scores);
        displayScorecard(scores, results);
        sc.close();
    }
}