package server;

import client.Client;
import client.ClientThread;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
    protected static ArrayList<ClientThread>clients;
    public static void main(String args[]){
        int portnumber=6969;
        try {
            ServerSocket serverSocket=new ServerSocket(portnumber);
            addClients(serverSocket);
        } catch (IOException e) {
            System.err.println("Could not find the portnumber");
            System.exit(1);
        }
    }
    public static void addClients(ServerSocket serverSocket){
        clients=new ArrayList<ClientThread>();
        while(true){
            try {
                Socket s=serverSocket.accept();
                ClientThread client=new ClientThread(s);
                Thread thread=new Thread();
                thread.start();
                clients.add(client);
            } catch (IOException e) {
                System.err.println("Could not add more clients");
            }
        }

    }


}
