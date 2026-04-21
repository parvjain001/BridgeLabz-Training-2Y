import java.util.*;

public class Q8 {
    static void generate(String[] arr) {
        System.out.println(arr[arr.length + 1]);
    }

    static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        try {
            generate(arr);
        } catch (Exception e) {}

        handle(arr);
        sc.close();
    }
}