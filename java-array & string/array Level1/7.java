import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        if (n <= 0) return;

        int[] even = new int[n];
        int[] odd = new int[n];
        int e = 0, o = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[e++] = i;
            } else {
                odd[o++] = i;
            }
        }

        for (int i = 0; i < o; i++) System.out.print(odd[i] + " ");
        System.out.println();
        for (int i = 0; i < e; i++) System.out.print(even[i] + " ");
    }
}