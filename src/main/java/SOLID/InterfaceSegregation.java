package SOLID;

public class InterfaceSegregation {
    /**
     * Interface Segregation Principle
     *  - A client should never be forced to implement an interface that it doesn't use.
     *      which means that we should not have a big interface that contains many methods
     */

    // Bad code
    interface Worker {
        void work();
        void eat();
    }

    static class Human implements Worker {
        public void work() {
            System.out.println("Human is working");
        }

        public void eat() {
            System.out.println("Human is eating");
        }
    }

    // Good code
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    static class Robot implements Workable {
        public void work() {
            System.out.println("Robot is working");
        }
    }

    static class Human2 implements Workable, Eatable {
        public void work() {
            System.out.println("Human is working");
        }

        public void eat() {
            System.out.println("Human is eating");
        }
    }
}
