import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of the triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = sc.nextDouble();

        double areaSqCm = 0.5 * base * height;

        double areaSqIn = areaSqCm / 6.4516;

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
