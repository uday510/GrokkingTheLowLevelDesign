package SOLID;

public class LiskovSubstitution {

    /**
     * Liskov Substitution Principle
     *  - Objects in a program should be replaceable with instances of their subtypes without altering the
     *    correctness of that program.
     *
     *    In other words, if S is a subtype of T, then objects of type T may be replaced with objects of type S
     */

    // Before Liskov Substitution

    static class Bird {
        public void fly() {
            System.out.println("Bird is flying.");
        }
    }

    static class Ostrich extends Bird {
        // An ostrich cannot fly, but it respects the LSP by not changing the method's contract.
    }

    static class Sparrow extends Bird {
        @Override
        public void fly() {
            System.out.println("Sparrow is flying.");
        }
    }

    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        Bird bird2 = new Ostrich();

        bird1.fly();  // Output: Sparrow is flying.
        bird2.fly();  // Output: Bird is flying.
    }

}
