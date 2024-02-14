package SOLID;

public class DependencyInversion {

    /**
     * Dependency Inversion Principle
     *  - High-level modules should not depend on low-level modules. Both should depend on abstractions.
     *   which means that the high-level module should not depend on the low-level module,
     *    but they should depend on abstractions.
     */

    // Before Dependency Inversion

    static class LightBulb {
        public void turnOn() {
            System.out.println("LightBulb: Bulb turned on...");
        }
        public void turnOff() {
            System.out.println("LightBulb: Bulb turned off...");
        }
    }

    static class Switch {
        private final LightBulb lightBulb;
        public Switch(LightBulb lightBulb) {
            this.lightBulb = lightBulb;
        }
        public void turnOn() {
            lightBulb.turnOn();
        }
        public void turnOff() {
            lightBulb.turnOff();
        }
    }

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switch s = new Switch(lightBulb);
        s.turnOn();
        s.turnOff();
    }


    // After Dependency Inversion Principle
    interface Switchable {
        void turnOn();
        void turnOff();
    }

    static class Fan implements Switchable {
        public void turnOn() {
            System.out.println("Fan: Fan turned on...");
        }
        public void turnOff() {
            System.out.println("Fan: Fan turned off...");
        }
    }

    static class Light implements Switchable {
        public void turnOn() {
            System.out.println("Light: Light turned on...");
        }
        public void turnOff() {
            System.out.println("Light: Light turned off...");
        }
    }

}
