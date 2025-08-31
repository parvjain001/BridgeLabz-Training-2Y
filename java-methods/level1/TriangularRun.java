import java.util.Scanner;

public class TriangularRun {

    public static int calculateRounds(double side1, double side2, double side3, double targetDistance) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(targetDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park in meters: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park in meters: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park in meters: ");
        double side3 = sc.nextDouble();

        double targetDistance = 5000; // 5 km in meters

        int rounds = calculateRounds(side1, side2, side3, targetDistance);

        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
        sc.close();
    }
}
