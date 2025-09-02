import java.util.Scanner;
public class BasicCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result: " + add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
}
