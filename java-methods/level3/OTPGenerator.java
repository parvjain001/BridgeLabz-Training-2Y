package level3;

import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All OTPs Unique? " + areUnique(otps));
    }

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // ensures 6-digit number
    }

    public static boolean areUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size() == arr.length;
    }
}
