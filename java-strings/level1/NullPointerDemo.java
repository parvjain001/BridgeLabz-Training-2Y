public class NullPointerDemo {

    public static void generateException() {
        String text = "Hello";
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException generated in generateException()");
        }
    }

    public static void handleException() {
        String text = "Hello";
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in handleException(): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException generation:");
        generateException();

        System.out.println("\nDemonstrating NullPointerException handling:");
        handleException();
    }
}
