package gla.com.Lambda_expression;

interface LightAction {
    void activate();
}

public class SmartLightingDemo {
    public static void main(String[] args) {

        // Motion detected
        LightAction motion = () -> System.out.println("Lights ON (Motion detected)");

        // Night mode
        LightAction night = () -> System.out.println("Dim lights (Night mode)");

        // Voice command
        LightAction voice = () -> System.out.println("Lights OFF (Voice command)");

        motion.activate();
        night.activate();
        voice.activate();
    }
}
