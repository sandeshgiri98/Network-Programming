package SandeshReport;

import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class UdpPortScanner {
    public static void main(String[] args) {
        System.out.println("Sandesh Giri Network Programming Practical 12\n");
        for(int port=1024; port<=65535;port++){
            try{
                DatagramSocket server = new DatagramSocket(port);
            }catch (SocketException e){
                System.out.println("There is server on port: " + port);
            }
        }
    }
}

