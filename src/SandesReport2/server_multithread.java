package SandesReport2;
import java.io.*;
import java.net.*;

public class server_multithread {
    public static void main(String[] args){
        System.out.println("Sandesh Giri Network Programming Practical 11 Server\n");
        ServerSocket server = null;
        try {
            server = new ServerSocket(3456);
            server.setReuseAddress(true);
            while (true) {
                Socket client = server.accept();
                System.out.println("New client connected" + client.getInetAddress().getHostAddress());
                ClientHandler clientSock = new ClientHandler(client);
                new Thread(clientSock).start();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (server != null) {
                try {
                    server.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // ClientHandler class
    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;
        public ClientHandler(Socket socket){
            this.clientSocket = socket;
        }

        public void run() {
            PrintWriter out = null;
            BufferedReader in = null;
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.printf(" Sent from the client: %s\n", line);
                    out.println(line);
                }
            }catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (out != null) {
                        out.close();
                    }
                    if (in != null) {
                        in.close();
                        clientSocket.close();
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

