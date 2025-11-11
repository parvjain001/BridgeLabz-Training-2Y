import java.util.*;

public class CharacterWrapperUseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int letters = 0, digits = 0, specials = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch))
                letters++;
            else if (Character.isDigit(ch))
                digits++;
            else if (!Character.isWhitespace(ch))
                specials++;
        }

        System.out.println("Total letters: " + letters);
        System.out.println("Total digits: " + digits);
        System.out.println("Total special characters: " + specials);
        sc.close();
    }
}
