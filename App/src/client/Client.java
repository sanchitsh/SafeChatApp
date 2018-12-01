package client;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String args[]){
        Socket socket=null;
        int portnumber=69696;
        try {
            socket=new Socket("localhost",portnumber);
        } catch (IOException e) {
            System.err.println("Connection Error!");
            System.exit(1);
        }
    }
}
