import java.util.function.Function;

public class Stringlencheck {
    public static void main(String[] args) {
        int limit = 20;
        Function<String, Integer> getLength = str -> str.length();

        String message = "This is a long message";
        int length = getLength.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds the character limit. Length: " + length);
        } else {
            System.out.println("Message is within the limit. Length: " + length);
        }
    }
}
