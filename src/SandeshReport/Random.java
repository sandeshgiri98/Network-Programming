package SandeshReport;

import java.io.IOException;
import java.net.ServerSocket;

public class Random {
    public static void main(String[] args) {
        try{
            System.out.println("Sandesh Giri Network Programming Practical 13\n");
            ServerSocket server = new ServerSocket(0);
            System.out.println("This server runs on port " + server.getLocalPort());
        }catch (IOException e){
            System.err.println(e);
        }
    }
}

