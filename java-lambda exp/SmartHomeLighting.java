interface LightBehavior {
    void activate();
}
public class SmartHomeLighting {
    public static void main(String[] args) {
        LightBehavior motionDetected = () -> 
            System.out.println("Motion detected! Turning ON lights at 80% brightness.");
        LightBehavior morningTime = () -> 
            System.out.println("Good morning! Setting warm light at 60% brightness.");
        LightBehavior nightTime = () -> 
            System.out.println("Night mode ON! Activating dim blue light for relaxation.");
        LightBehavior voiceCommand = () -> 
            System.out.println("Voice command received: Turning ON decorative lights.");

        activateLight("motion", motionDetected);
        activateLight("morning", morningTime);
        activateLight("night", nightTime);
        activateLight("voice", voiceCommand);
    }

    public static void activateLight(String trigger, LightBehavior behavior) {
        System.out.println("\nTrigger: " + trigger.toUpperCase());
        behavior.activate();
    }
}
