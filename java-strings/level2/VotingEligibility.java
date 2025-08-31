package level2;

import java.util.Scanner;

public class VotingEligibility {

    public static int[] takeStudentAges(int n, Scanner sc) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "Cannot Vote";
            else if (ages[i] >= 18) result[i][1] = "Can Vote";
            else result[i][1] = "Cannot Vote";
        }
        return result;
    }

    public static void displayEligibility(String[][] arr) {
        System.out.println("\nAge\tVoting Eligibility");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int[] ages = takeStudentAges(10, sc);
        String[][] eligibility = checkVotingEligibility(ages);
        displayEligibility(eligibility);
        sc.close();  
    }
}