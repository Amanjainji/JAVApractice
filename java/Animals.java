package java;

public class Animals {
    // Abstract Animal class
    abstract class Animal {
        String color;

        // Constructor with a parameter
        Animal(String color) {
            this.color = color;
        }

        // Abstract method to be overridden by subclasses
        abstract void walk();

        // Non-abstract method in the Animal class
        void breathe() {
            System.out.println("This animal breathes air");
        }
        
        // Default constructor (Not needed for creating concrete objects, but can be used by subclasses)
        Animal() {
            System.out.println("You are about to create an Animal.");
        }
    }

    // Horse class extends Animal
    class Horse extends Animal {
        String name;

        // Constructor with parameters
        Horse(String name, String color) {
            super(color);  // Calling the constructor of the superclass (Animal)
            this.name = name;
            System.out.println("Wow, you have created a Horse!");
        }

        // Default constructor (Optional)
        Horse() {
            super("Unknown");  // Call to the Animal constructor with color parameter
            System.out.println("Wow, you have created a Horse!");
        }

        // Method overriding the abstract method 'walk'
        void walk() {
            System.out.println(name + " " + color);
            System.out.println("Horse walks on 4 legs");
        }
    }

    // Chicken class extends Animal
    class Chicken extends Animal {

        // Default constructor
        Chicken(String color) {
            super(color);  // Calling the constructor of the superclass (Animal)
            System.out.println("Wow, you have created a Chicken!");
        }

        // Method overriding the abstract method 'walk'
        void walk() {
            System.out.println("Chicken walks on 2 legs");
        }
    }

    public static void main(String args[]) {
        Animals a = new Animals();
        
        // Creating a Horse object with name and color
        Horse horse = a.new Horse("Harsh", "Black");
        horse.walk();   // Calling the overridden method
        horse.breathe(); // Calling the method from Animal class
        
        // Creating a Chicken object with color
        Chicken chicken = a.new Chicken("White");
        chicken.walk();  // Calling the overridden method
        chicken.breathe(); // Calling the method from Animal class
    }
}
