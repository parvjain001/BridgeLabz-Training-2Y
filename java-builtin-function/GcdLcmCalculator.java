import java.util.Scanner;

public class GcdLcmCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = takeInput("Enter first number: ");
        int b = takeInput("Enter second number: ");

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
    public static int takeInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }
    public static int calculateGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    public static int calculateLCM(int x, int y, int gcd) {
        return (x * y) / gcd;
    }
}
