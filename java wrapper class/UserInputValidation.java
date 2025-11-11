import java.util.*;

public class UserInputValidation {
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = sc.nextLine();

        if (isValidAge(input))
            System.out.println("✅ Age is valid and user is 18 or older.");
        else
            System.out.println("❌ Invalid age or under 18.");
            sc.close();
    }
}
