import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[10];
        int idx = 0;

        while (n != 0 && idx < 10) {
            arr[idx++] = n % 10;
            n /= 10;
        }

        int max = 0, second = 0;

        for (int i = 0; i < idx; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }

        System.out.println(max + " " + second);
        sc.close();
    }
}