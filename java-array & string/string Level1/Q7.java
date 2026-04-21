import java.util.*;

public class Q7 {
    static void generate(String s) {
        int x = Integer.parseInt(s);
        System.out.println(x);
    }

    static void handle(String s) {
        try {
            int x = Integer.parseInt(s);
            System.out.println(x);
        } catch (NumberFormatException e) {
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