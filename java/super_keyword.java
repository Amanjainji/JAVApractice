package java;
public class super_keyword {
    class Parent {
        int value = 10;
        void display(){
            System.out.println("Greeting");
        }
    }
    
    class Child extends Parent {
        int value = 20;
    
        void display() {
            System.out.println("Child value: " + value);         // Access child field
            System.out.println("Parent value: " + super.value);  // Access parent field
            super.display();
        }

    }
    
   
    public static void main(String[] args) {
        super_keyword s=new super_keyword();
        Child obj = s.new Child();
        obj.display();
    }
    
    
}
