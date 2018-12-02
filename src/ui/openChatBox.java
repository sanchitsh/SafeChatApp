package ui;

import server.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class openChatBox implements ActionListener {
    ChatMenu chatMenu;

    public openChatBox(ChatMenu chatMenu) {
        this.chatMenu = chatMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        chatMenu.setVisible(false);
//        Server s = new Server();
//        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        s.startRunning();
    }
}
