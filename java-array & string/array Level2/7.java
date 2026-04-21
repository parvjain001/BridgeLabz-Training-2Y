import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

            if (data[i][2] <= 18.4) status[i] = "Underweight";
            else if (data[i][2] <= 24.9) status[i] = "Normal";
            else if (data[i][2] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
        }
        sc.close();
    }
}