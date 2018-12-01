package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static void main(String args[]){
        int portnumber=69696;
        try {
            ServerSocket serverSocket=new ServerSocket(portnumber);
            addClients(serverSocket);
        } catch (IOException e) {
            System.err.println("Could not find the portnumber");
            System.exit(1);
        }
    }
    public static void addClients(ServerSocket serverSocket){
        while(true){
            try {
                Socket s=serverSocket.accept();

            } catch (IOException e) {
                System.err.println("Could not add more clients");
            }
        }
    }

}
