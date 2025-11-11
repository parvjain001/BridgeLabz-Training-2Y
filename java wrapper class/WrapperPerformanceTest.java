import java.util.*;

public class WrapperPerformanceTest {
    public static void main(String[] args) {
        int size = 1_000_000;

        int[] intArray = new int[size];
        for (int i = 0; i < size; i++)
            intArray[i] = i;

        ArrayList<Integer> intList = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
            intList.add(i);

        long start1 = System.currentTimeMillis();
        long sum1 = 0;
        for (int n : intArray)
            sum1 += n;
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        long sum2 = 0;
        for (int n : intList)
            sum2 += n; 
        long end2 = System.currentTimeMillis();

        System.out.println("Sum using int[]: " + sum1 + " | Time: " + (end1 - start1) + " ms");
        System.out.println("Sum using ArrayList<Integer>: " + sum2 + " | Time: " + (end2 - start2) + " ms");
    }
}
