package Networking;
import java.io.*;
import java.net.*;

public class ServerCode {
    public static void main(String[] args) {
        int port = 5000; // Define the port number
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);
            
                Socket socket = serverSocket.accept(); // Wait for client connection
                System.out.println("New client connected");

                // Input and Output Streams
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                // Read and respond to client
                String clientMessage;
                while ((clientMessage = reader.readLine()) != null) {
                    System.out.println("Client: " + clientMessage);
                    writer.println("Server: " + clientMessage.toUpperCase());
                }

                socket.close(); // Close client socket
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
