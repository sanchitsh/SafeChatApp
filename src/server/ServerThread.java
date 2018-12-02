package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket;
    private String name;
    private BufferedReader serverIn;
    private BufferedReader userIn;
    private PrintWriter out;


    public ServerThread(Socket socket, String name) {
        this.socket=socket;
        this.name=name;

    }

    @Override
    public void run() {
        try {
            out=new PrintWriter(socket.getOutputStream(),true);

            serverIn=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            userIn=new BufferedReader(new InputStreamReader(System.in));

            while(!socket.isClosed()){
                if(serverIn.ready()){
                    String in =serverIn.readLine();
                    if(in !=null){
                        System.out.println(in);
                    }
                }
                if(userIn.ready()){
                    out.println(name+" > "+userIn.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
