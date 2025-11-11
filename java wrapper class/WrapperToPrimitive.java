public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = 45.67;
        double d = dObj;
        int i = (int) dObj.doubleValue();
        System.out.println("Double object: " + dObj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int: " + i);
    }
}
