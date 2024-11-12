package SandesReport2;
//Getter methods and testing reachability program


import java.io.IOException;
import java.net.InetAddress;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Sandesh Giri Network Programming Practical 3");

        // Print www.yahoo.com address details
        printAddressDetails("www.demo2s.com");

        // Print the loopback address details
        printAddressDetails(null);  //   w  w   w  . d   e m  o 2    s  .  c o  m

        // Print the loopback address details using IPv6 format
        printAddressDetails("::1");
    }

    public static void printAddressDetails(String host) {
        System.out.println("Host name: " + host);
        try {
            InetAddress addr = InetAddress.getByName(host);
            System.out.println("Host IP Address: " + addr.getHostAddress());
            System.out.println("Canonical Host Name: " +
                    addr.getCanonicalHostName());

            int timeOutinMillis = 10000;
            System.out.println("isReachable(): " +
                    addr.isReachable(timeOutinMillis));
            System.out.println("isLoopbackAddress(): " +
                    addr.isLoopbackAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("------\n");
        }
    }
}

