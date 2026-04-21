import java.util.*;

public class Q5 {
    static void generate(String s) {
        System.out.println(s.charAt(s.length() + 1));
    }

    static void handle(String s) {
        try {
            System.out.println(s.charAt(s.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        try {
            generate(s);
        } catch (Exception e) {}

        handle(s);
        sc.close();
    }
}