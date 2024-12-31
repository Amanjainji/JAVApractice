package fileHandling;
import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.dat");
             FileOutputStream fos = new FileOutputStream("output.dat")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println(data);
                fos.write(data); //Write data byte by byte
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}





