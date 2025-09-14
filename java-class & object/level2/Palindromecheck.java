package level2;

class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}

public class Palindromecheck {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("Level");
        PalindromeChecker p2 = new PalindromeChecker("Java");

        p1.displayResult();
        p2.displayResult();
    }
}

