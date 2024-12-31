package Networking;
import java.io.*;
import java.net.*;

public class ClientCode {
    public static void main(String[] args) {
        String hostname = "localhost"; // Server IP or hostname
        int port = 5000; // Server port number

        try (Socket socket = new Socket(hostname, port)) {
            // Input and Output Streams
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Send messages to the server
            writer.println("Hello Server");
            writer.println("How are you?");
            writer.println("exit");

            // Read server responses
            String serverMessage;
            while ((serverMessage = reader.readLine()) != null) {
                System.out.println(serverMessage);
            }
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}


