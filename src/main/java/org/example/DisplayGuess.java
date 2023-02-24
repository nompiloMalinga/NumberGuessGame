package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DisplayGuess extends JFrame {
    private JButton guessButton;
    private JTextField numberGuess;
    private JTextField textField2;
    private JTextField message;
    private JPanel guessGame;

    private ImageIcon image;

    public DisplayGuess() {

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int myNumber = Integer.parseInt(numberGuess.getText());
                int randomNUmber = random.nextInt(10) + 1;

                if (myNumber == randomNUmber) {
                    message.setText("Correct you Win!!");
                } else if (randomNUmber > myNumber) {
                    message.setText("Nope number is higher . Guess again!!");

                } else {
                    message.setText("Nope number is lower. Guess again!!");
                }
                textField2.setText("number was: " + randomNUmber);

            }
        });
    }

    public static void main(String[] args) {
        DisplayGuess displayGuess = new DisplayGuess();
        displayGuess.setContentPane(displayGuess.guessGame);
        displayGuess.setTitle("Welcome");
        displayGuess.setSize(550, 550);
        displayGuess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayGuess.setVisible(true);
    }


}
