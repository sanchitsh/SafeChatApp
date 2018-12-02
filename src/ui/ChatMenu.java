package ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ChatMenu extends JFrame {

    public ChatMenu() {
        super("Chat Menu");
    }

    public void main() {
        getContentPane().setBackground(Color.WHITE);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        JPanel cards = new JPanel(new GridLayout(3,0));
        JPanel characterProfile = new JPanel();
        JPanel characterOptions = new JPanel();

        try {
            BufferedImage image = ImageIO.read(this.getClass().getResource("logo.jpg"));
            cards.add(new JLabel(new ImageIcon(image)));
        }
        catch (IOException e) {
            System.out.println("not found!");
        }

        characterProfile.add(new JButton("test"));
        characterProfile.add(new JButton("test2"));

        characterOptions.add(new JButton("test3"));

        cards.add(characterProfile);
        cards.add(characterOptions);
        add(cards, BorderLayout.CENTER);
        cards.setBorder(BorderFactory.createEmptyBorder(30,10,10,10));

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
