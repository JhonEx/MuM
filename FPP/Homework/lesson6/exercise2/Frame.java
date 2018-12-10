package lesson6.exercise2;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 100, 800, 600);

        JPanel panel = new JPanel();

        for (RainBow rainBow: RainBow.get()) {
            JButton btn = new JButton();
            btn.setBackground(rainBow.getColor());
            btn.setOpaque(true);
            btn.setPreferredSize(new Dimension(100, 100));
            btn.setBorderPainted(false);
            btn.addActionListener(new EventHandler(rainBow.getDescription()));
            panel.add(btn);
        }

        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(panel);
    }

    public static void main(String[] args) {
        new Frame();
    }
}
