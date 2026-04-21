import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = 10;
        int[] factors = new int[size];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == size) {
                    size *= 2;
                    int[] temp = new int[size];
                    for (int j = 0; j < idx; j++) temp[j] = factors[j];
                    factors = temp;
                }
                factors[idx++] = i;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(factors[i] + " ");
        }
        sc.close();
    }
}