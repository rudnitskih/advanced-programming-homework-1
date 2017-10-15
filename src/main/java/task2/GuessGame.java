package task2;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.text.MessageFormat;
import java.util.Random;

/**
 * Created by rudnitskih on 10/14/17.
 */
class GuessGame {
    @Getter
    @Setter
    private Integer bestScore = 0;

    private Integer min = 0;
    private Integer max = 100;

    void play() {
        Boolean isUserWin = false;
        Integer userAttempts = 0;
        Integer currentScore;

        Integer secretNumber = generateSecretNumber();

        showMessage(MessageFormat.format("Please guess number from {0} to {1}.", min, max));

        while (!isUserWin) {
            String userRoundMessage = "Your guess is correct!!! You win.";

            userAttempts++;

            Integer userGuess = Integer.parseInt(
                JOptionPane.showInputDialog(
                    null,
                    "Your guess:"
                )
            );

            if (userGuess < secretNumber) {
                userRoundMessage = "Sorry, but your guess is less than secret number";
            } else if (userGuess > secretNumber) {
                userRoundMessage = "Sorry, but your guess is greater than secret number";
            } else {
                isUserWin = true;
            }

            showMessage(userRoundMessage);
        }

        currentScore = max / userAttempts;

        if (currentScore > bestScore) {
            bestScore = currentScore;
        }
    }

    private Integer generateSecretNumber() {
        return new Random().nextInt(max) % (max - min + 1) + min;
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
