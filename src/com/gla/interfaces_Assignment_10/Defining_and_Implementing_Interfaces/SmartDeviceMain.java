package com.gla.interfaces_Assignment_10.Defining_and_Implementing_Interfaces;
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light ON"); }
    public void turnOff() { System.out.println("Light OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC ON"); }
    public void turnOff() { System.out.println("AC OFF"); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV ON"); }
    public void turnOff() { System.out.println("TV OFF"); }
}
public class SmartDeviceMain {
    public static void main(String[] args) {
        SmartDevice d = new TV();
        d.turnOn();
        d.turnOff();
    }
}
