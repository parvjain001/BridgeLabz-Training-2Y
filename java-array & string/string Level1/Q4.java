public class Q4 {
    static void generate() {
        String s;
        if (System.currentTimeMillis() > 0) {
            s = null;
        } else {
            s = "abc";
        }
        System.out.println(s.length());
    }
    static void handle() {
        try {
            String s;
            if (System.currentTimeMillis() > 0) {
                s = null;
            } else {
                s = "abc";
            }
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Handled");
        }
    }
    public static void main(String[] args) {
        try {
            generate();
        } catch (Exception e) {}

        handle();
    }
}