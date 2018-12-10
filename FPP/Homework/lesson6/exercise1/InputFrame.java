package lesson6.exercise1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputFrame extends JFrame {
    private JButton btnCountLetter;
    private JButton btnReverseLetter;
    private JButton btnRemoveDuplicate;
    private JLabel labelInput;
    private JLabel labelOutput;
    private JTextField inputField;
    private JTextField outputField;

    public InputFrame(String title) {
        super(title);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 100, 400, 300);

        initialComponent();
        AddEventListener();

        add(addPanelComponent());
    }

    private void initialComponent() {
        createButton();
        setButtonBoundary();
        createLabel();
        createInputField();
        setLabelBoundary();
        setBoundaryInputField();
    }

    private void createButton() {
        btnCountLetter = new JButton("Count Letters");
        btnReverseLetter = new JButton("Reverse Letters");
        btnRemoveDuplicate = new JButton("Remove Duplicates");
    }

    private void setButtonBoundary() {
        btnCountLetter.setBounds(10, 50, 150, 40);
        btnReverseLetter.setBounds(10, 100, 150, 40);
        btnRemoveDuplicate.setBounds(10, 150, 150, 40);
    }

    private void createInputField() {
        inputField = new JTextField();
        outputField = new JTextField();
    }

    private void createLabel() {
        labelInput = new JLabel("Input");
        labelOutput = new JLabel("Output");
    }

    private void setLabelBoundary() {
        labelInput.setBounds(170, 75, 50, 30);
        labelOutput.setBounds(170, 115, 50, 30);
    }

    private void setBoundaryInputField() {
        inputField.setBounds(165, 100, 140, 20);
        outputField.setBounds(165, 140, 140, 20);
    }

    private JPanel addPanelComponent() {
        JPanel panel = new JPanel();

        panel.setPreferredSize(new Dimension(300, 300));
        panel.setLayout(null);

        panel.add(btnCountLetter);
        panel.add(btnReverseLetter);
        panel.add(btnRemoveDuplicate);

        panel.add(labelInput);
        panel.add(inputField);
        panel.add(labelOutput);
        panel.add(outputField);

        return panel;
    }

    private void AddEventListener() {
        btnCountLetter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countLetters();
            }
        });

        btnReverseLetter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reverseLetters();
            }
        });

        btnRemoveDuplicate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeDuplicate();
            }
        });
    }

    private void countLetters() {
        String letters = inputField.getText();
        String count = Integer.toString(letters.toCharArray().length);
        outputField.setText(count);
    }

    private void reverseLetters() {
        String letters = inputField.getText();
        StringBuilder sb = new StringBuilder(letters);
        outputField.setText(sb.reverse().toString());
    }

    private void removeDuplicate() {
        String letters = inputField.getText();
        char characters[] = letters.toCharArray();

        StringBuilder sb = new StringBuilder();
        sb.append(characters[0]);

        for (int i = 1; i < characters.length; i++) {
            if (!isExisted(characters[i], sb.toString().toCharArray())) {
                sb.append(characters[i]);
            }
        }
        outputField.setText(sb.toString());
    }

    private boolean isExisted(char character, char[] existedChar) {
        for (int i = 0; i < existedChar.length; i++) {
            if (existedChar[i] == character) {
                return true;
            }
        }
        return false;
    }
}
