package java;
public class multiple_inheritence {
    interface Vehicle {
        void start();
    }
    
    interface Fuel {
        void fillTank();
    }
    
    class Car implements Vehicle, Fuel {
        @Override
        public void start() {
            System.out.println("Car is starting"); 
        }
    
        @Override
        public void fillTank() {
            System.out.println("Filling car tank");
        }
    }
    
        public static void main(String[] args) {
            multiple_inheritence a=new multiple_inheritence();
            Car car = a.new Car();
            car.start();
            car.fillTank();
        }
    
    
}
