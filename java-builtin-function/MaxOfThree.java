import java.util.Scanner;
public class MaxOfThree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = takeInput("Enter first number: ");
        int b = takeInput("Enter second number: ");
        int c = takeInput("Enter third number: ");

        int max = findMaximum(a, b, c);
        System.out.println("Maximum number is: " + max);
    }
    public static int takeInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }
    public static int findMaximum(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }
}
