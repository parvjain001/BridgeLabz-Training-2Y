interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is turned ON");
    }
    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is turned ON");
    }
    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

public class Smartdevice {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
