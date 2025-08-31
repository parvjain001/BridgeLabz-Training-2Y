package level2;

import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // 0: height, 1: weight, 2: BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double height, weight;

            while (true) {
                System.out.println("Person " + (i + 1) + ":");
                System.out.print("Enter height (meters): ");
                height = sc.nextDouble();
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();

                if (height > 0 && weight > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Height and weight must be positive. Enter again.");
                }
            }

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height); // BMI calculation

            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}

