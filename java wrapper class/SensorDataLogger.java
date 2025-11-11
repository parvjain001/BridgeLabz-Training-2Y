public class SensorDataLogger {
    public static void logTemperature(double primitiveTemp) {
        Double wrapperTemp = primitiveTemp;
        System.out.println("Stored temperature (Double): " + wrapperTemp);
    }

    public static void logTemperature(Double wrapperTemp) {
        double primitiveTemp = wrapperTemp; 
        System.out.println("Read temperature (primitive): " + primitiveTemp);
    }

    public static void main(String[] args) {
        double tempPrimitive = 36.5;
        Double tempWrapper = 28.9;

        logTemperature(tempPrimitive);
        logTemperature(tempWrapper);   
    }
}
