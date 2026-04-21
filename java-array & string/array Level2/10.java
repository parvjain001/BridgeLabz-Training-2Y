import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] freq = new int[10];

        while (n != 0) {
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + freq[i]);
        }
        sc.close();
    }
}