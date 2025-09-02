import java.util.Scanner;

public class FactorialRecursion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = takeInput();
        long fact = calculateFactorial(number);
        displayResult(number, fact);
    }
    public static int takeInput() {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
