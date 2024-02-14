package OOPS;

// Method overriding is a feature that allows a subclass or child class to provide a specific implementation of a
// method that is already provided by one of its super-classes or parent classes.
public class MethodOverriding {
    static class Parent {
        void show() {
            System.out.println("Parent's show()");
        }
    }

    static class Child extends Parent {
        void show() {
            System.out.println("Child's show()");
        }
    }

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();

        Parent obj2 = new Child();
        obj2.show();
    }
}
