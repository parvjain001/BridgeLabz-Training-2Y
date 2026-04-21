public class AvgTemp1 {
    public static double findAverage(int[] temp) {
        int sum = 0;
        for(int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        return (double) sum / temp.length;
    }

    public static void main(String[] args) {
        int[] t = {30, 32, 31, 29, 35};
        System.out.println(findAverage(t));
    }
}