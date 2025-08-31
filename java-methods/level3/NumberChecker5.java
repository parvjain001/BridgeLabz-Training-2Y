package level3;

public class NumberChecker5 {
    public static void main(String[] args) {
        int number = 145;

        System.out.println("Number: " + number);
        System.out.println("Is Perfect: " + isPerfect(number));
        System.out.println("Is Abundant: " + isAbundant(number));
        System.out.println("Is Deficient: " + isDeficient(number));
        System.out.println("Is Strong: " + isStrong(number));
    }

    public static boolean isPerfect(int num) {
        int sum = sumOfProperDivisors(num);
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = sumOfProperDivisors(num);
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = sumOfProperDivisors(num);
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    private static int sumOfProperDivisors(int num) {
        int sum = 1; 
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return (num == 1) ? 0 : sum;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
