package SandesReport2;
//. Construct a DatagramPacket to receive data
import java.io.*;
import java.net.*;
public class DatagramExample {
    public static void main(String[] args) {
        System.out.println("Sandesh Giri Network Programming Practical 15\n");
        String s = "This is a test.";
        try {
            byte[] data = s.getBytes("UTF-8");
            InetAddress ia = InetAddress.getByName("www.ibiblio.org");
            int port = 7;
            DatagramPacket dp
                    = new DatagramPacket(data, data.length, ia, port);
            System.out.println("This packet is addressed to "
                    + dp.getAddress() + " on port " + dp.getPort());
            System.out.println("There are " + dp.getLength()
                    + " bytes of data in the packet");
            System.out.println(
                    new String(dp.getData(), dp.getOffset(), dp.getLength(), "UTF-8"));
        } catch (UnknownHostException | UnsupportedEncodingException ex) {
            System.err.println(ex);
        }
    }
}

