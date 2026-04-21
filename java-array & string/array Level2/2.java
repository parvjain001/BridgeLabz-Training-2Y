import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];
        String[] name = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int minAge = age[0], minIndex = 0;
        double maxHeight = height[0];
        int maxIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                minIndex = i;
            }
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                maxIndex = i;
            }
        }

        System.out.println(name[minIndex]);
        System.out.println(name[maxIndex]);
        sc.close();
    }
}