package client;

import server.ServerThread;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String args[]){
        Socket socket=null;
        int portnumber=69696;
        try {
            socket=new Socket("localhost",portnumber);
            Thread.sleep(1000);
            Thread server=new Thread((Runnable) new ServerThread(socket));
            server.start();
        } catch (IOException e) {
            System.err.println("Connection Error!");
            System.exit(1);
        } catch (InterruptedException e) {
            System.err.println("Connection Error!");
            System.exit(1);
        }
    }
}
