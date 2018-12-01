package client;

import server.ChatServer;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends ChatServer implements Runnable {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter pw;
    public ClientThread(Socket s){
        this.socket=s;
    }

    @Override
    public void run() {

    }
}
