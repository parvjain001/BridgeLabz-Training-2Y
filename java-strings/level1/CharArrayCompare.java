import java.util.Scanner;

public class CharArrayCompare {
    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] userChars = getChars(input);
        char[] builtInChars = input.toCharArray();

        System.out.print("Characters using user-defined method: ");
        for (char c : userChars) System.out.print(c + " ");
        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char c : builtInChars) System.out.print(c + " ");
        System.out.println();

        boolean result = compareCharArrays(userChars, builtInChars);
        System.out.println("Both arrays are equal: " + result);
        sc.close();
    }
}
