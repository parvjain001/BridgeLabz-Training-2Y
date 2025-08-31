import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert to number: ");
        String input = sc.next();

        System.out.println("Generating NumberFormatException:");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling NumberFormatException:");
        handleException(input);
        sc.close();
    }
}
