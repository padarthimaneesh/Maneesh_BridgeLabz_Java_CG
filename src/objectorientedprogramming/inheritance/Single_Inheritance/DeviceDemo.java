package objectorientedprogramming.inheritance.Single_Inheritance;
class Device {
    String deviceId;
    boolean status;

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperature;

    Thermostat(String id, boolean status, int temp) {
        super(id, status);
        this.temperature = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
        System.out.println("Temperature: " + temperature);
    }
}

public class DeviceDemo {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T101", true, 24);
        t.displayStatus();
    }
}
