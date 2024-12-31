package java;
public class interface2 {
    // Define an interface
    interface Animal {
    final int a=5;
    // Abstract method
    void sound();

    // Default method 
    default void sleep() {
        System.out.println("Sleeping...");
    }

    // Static method 
    static void info() {
        System.out.println("This is an Animal interface.");
    }
}

// Implementing the interface in a class
class Dog implements Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

    public static void main(String[] args) {
        interface2 a=new interface2();
        Dog dog = a.new Dog();
        dog.sound(); // Calls the overridden method
        dog.sleep(); // Calls the default method
        Animal.info(); // Calls the static method
    }

}
