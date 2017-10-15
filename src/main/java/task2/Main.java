package task2;

import javax.swing.*;

/**
 * Created by rudnitskih on 10/14/17.
 */
public class Main {
    public static void main(String[] args) {
        int wantContinue = JOptionPane.YES_OPTION;

        GuessGame guessGame = new GuessGame();

        while (wantContinue == JOptionPane.YES_OPTION) {
            guessGame.play();

            wantContinue = JOptionPane.showConfirmDialog(null,
                "Do you wanna continue?",
                "Choose",
                JOptionPane.YES_NO_OPTION);
        }

        JOptionPane.showMessageDialog(null,
            "Your score: " + guessGame.getBestScore()
        );
    }
}
