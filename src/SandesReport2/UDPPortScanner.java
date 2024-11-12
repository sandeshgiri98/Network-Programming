package SandesReport2;

import java.net.*;
public class UDPPortScanner {
    public static void main(String[] args) {
        System.out.println("Sandesh Giri Network Programming Practical 16\n");
        for (int port = 1024; port <= 65535; port++) {
            try {
                // the next line will fail and drop into the catch block if
                // there is already a server running on port i
                DatagramSocket server = new DatagramSocket(port);
                server.close();
            } catch (SocketException ex) {
                System.out.println("There is a server on port " + port + ".");
            }
        }
    }
}
