package java;
import java.util.Scanner;

public class testing {
    public static void main(String args[]){

        int price = 100;
        float gst = 18.00f;
        int finalPrice = price + (int)gst;

        System.out.println(finalPrice);

        try (Scanner sc = new Scanner(System.in)) {
            //int n = sc.nextInt();
            //float a = sc.nextFloat();
            //String name = sc.next();
            //String line = sc.nextLine();

            //System.out.println(line);
            
        }

        int[] marks = {98, 97, 95};
        try {
            System.out.println(marks[4]);
        } 
        catch (Exception exception) {
            System.out.println("An exception for caught while accessing an index the 'marks' array");
        }

    }
}
