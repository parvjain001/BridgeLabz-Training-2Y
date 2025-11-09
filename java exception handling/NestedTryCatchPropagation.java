public class NestedTryCatchPropagation {

    public static void methodB() {
        try {
            String number = "abc"; 
            int num = Integer.parseInt(number);
            String str = null; 
            System.out.println(str.length()); 
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Handled in methodB: Invalid number format!");
        }
    }

    public static void methodA() {
        try {
            methodB(); 
        } catch (NullPointerException e) {
            System.out.println("⚠️ Handled in methodA: Null value encountered!");
        } catch (Exception e) {
            System.out.println("⚠️ Other exception handled in methodA: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        methodA();
        System.out.println("✅ Program executed successfully.");
    }
}
