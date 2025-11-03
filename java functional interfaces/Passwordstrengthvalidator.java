interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[@#$%^&+=!].*");
    }
}

public class Passwordstrengthvalidator {
    public static void main(String[] args) {
        String password1 = "Pass@123";
        String password2 = "weakpass";

        System.out.println(password1 + " is strong: " + SecurityUtils.isStrongPassword(password1));
        System.out.println(password2 + " is strong: " + SecurityUtils.isStrongPassword(password2));
    }
}
