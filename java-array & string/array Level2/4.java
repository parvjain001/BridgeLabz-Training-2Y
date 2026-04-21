import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = 10;
        int[] arr = new int[size];
        int idx = 0;

        while (n != 0) {
            if (idx == size) {
                size += 10;
                int[] temp = new int[size];
                for (int i = 0; i < idx; i++) temp[i] = arr[i];
                arr = temp;
            }
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