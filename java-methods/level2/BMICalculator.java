package level2;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        calculateBMI(teamData);
        String[] status = determineBMIStatus(teamData);

        System.out.println("\nWeight(kg)  Height(cm)  BMI      Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-11.2f %-8.2f %s%n", teamData[i][0], teamData[i][1], teamData[i][2], status[i]);
        }
        sc.close();
    }
}
