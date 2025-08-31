import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // intentionally beyond last index
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length())); // intentionally beyond last index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("Generating StringIndexOutOfBoundsException:");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(input);
        sc.close();
    }
}
