package lesson6.exercise2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class EventHandler implements ActionListener {
    private String description;

    public EventHandler(String description) {
        this.description = description;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        showMessageDialog(source, description, "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
    }
}