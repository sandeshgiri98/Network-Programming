package SandesReport2;

//URL program


import java.net.*;
public class url{
    public static void main(String[] args){
        try{
            System.out.println("Sandesh Giri Network Programming Practical 6 URL\n");
            URL url=new URL("http://www.javatpoint.com/80/java-tutorial");

            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());

        }catch(Exception e){System.out.println(e);}
    }
}

