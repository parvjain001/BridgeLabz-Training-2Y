import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height;

        double areaInCm = areaInInches * 6.4516;

        System.out.println("Area of triangle in square inches: " + areaInInches);
        System.out.println("Area of triangle in square centimeters: " + areaInCm);

        double heightCm = height * 2.54;
        double heightFeet = height / 12;
        double heightInches = height % 12;

        System.out.println("Your height in cm is " + heightCm +
            ", while in feet is " + (int)heightFeet + " and inches is " + heightInches);
    }
}
