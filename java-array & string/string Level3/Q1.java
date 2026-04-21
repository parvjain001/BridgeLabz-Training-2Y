import java.util.*;

public class Q1 {
    static String status(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;

            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0;

            System.out.println(weight + " " + height + " " + bmi + " " + status(bmi));
        }
        sc.close();
    }
}