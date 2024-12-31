package java;
public class interfaces {
    interface Animal {
        void walk();
    }
    class Horse implements Animal {
        public void walk() {
            System.out.println("Horse walks on 4 legs");
        }
    }
    class Chicken implements Animal {
        public void walk() {
            System.out.println("Chicken walks on 2 legs");
        }
    }
        public static void main(String args[]) {
            interfaces a=new interfaces();
            Horse horse = a.new Horse();
            horse.walk();
        }
            
}
