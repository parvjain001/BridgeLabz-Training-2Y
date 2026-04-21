import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
            sc.close();
        }
    }
}