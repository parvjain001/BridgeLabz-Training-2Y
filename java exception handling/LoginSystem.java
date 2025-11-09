import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
public class LoginSystem {

    public static void validate(String user, String pass) throws InvalidCredentialsException {
        String validUser = "admin";
        String validPass = "1234";

        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            try {
                validate(user, pass);
                System.out.println("✅ Login successful! Welcome, " + user + "!");
                success = true;
            } catch (InvalidCredentialsException e) {
                System.out.println("❌ " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        sc.close();
    }
}
