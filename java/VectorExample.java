package java;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Print elements
        System.out.println("Vector: " + vector);
        System.out.println("Vector: " + vector.indexOf("Apple"));


        // Access an element
        System.out.println("Element at index 1: " + vector.get(1)); // Output: Banana

        // Remove an element
        vector.remove(0); // Removes "Apple"
        System.out.println("After removal: " + vector);

        // Check size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Check if an element exists
        System.out.println("Contains 'Cherry': " + vector.contains("Cherry"));
        vector.clear();
    }
}


