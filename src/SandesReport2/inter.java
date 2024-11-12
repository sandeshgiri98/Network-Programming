package SandesReport2;

//program that lists all the network interfaces


import java.net.*;
import java.util.*;
public class inter {
    public static void main(String[] args) throws SocketException {
        System.out.println("Sandesh Giri Network Programming Practical 5\n");
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            System.out.println(ni);
        }
    }
}
