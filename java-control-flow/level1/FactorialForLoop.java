import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer (natural number): ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            long factorial = 1; 

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
