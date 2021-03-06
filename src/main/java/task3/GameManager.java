package task3;

import lombok.SneakyThrows;
import task3.characters.domain.Character;

import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

/**
 * Created by rudnitskih on 10/15/17.
 */
class GameManager {
    private Character activeCharacter;
    private Character passiveCharacter;
    private Integer roundNumber;

    @SneakyThrows
    void fight(Character c1, Character c2) {
        activeCharacter = c1;
        passiveCharacter = c2;
        roundNumber = 1;
        Integer maxRounds = 20;

        System.out.println("Status before fight: ");

        showCharacterInfo(c1);
        showCharacterInfo(c2);

        while (activeCharacter.isAlive() && roundNumber <= maxRounds) {
            showBeforeRoundInfo();
            activeCharacter.kick(passiveCharacter);
            showAfterRoundInfo();

            Character temp = activeCharacter;
            activeCharacter = passiveCharacter;
            passiveCharacter = temp;

            roundNumber++;
            TimeUnit.SECONDS.sleep(1);
        }

        if (roundNumber.equals(maxRounds)) {
            System.out.println("\nLooks like any fighter cannot bit each other.");
        } else {
            System.out.println(
                MessageFormat.format(
                    "\n    !!! The {0} win !!!    ",
                    passiveCharacter.getClass().getSimpleName()
                )
            );
        }
    }

    private void showCharacterInfo(Character character) {
        System.out.println(
            MessageFormat.format(
                "{0} with power: {1} and HP: {2}",
                character.getClass().getSimpleName(),
                character.getPower(),
                character.getHp()
            )
        );
    }

    private void showBeforeRoundInfo() {
        System.out.println("\nRound number " + this.roundNumber.toString() + "\n" + "=========================");

        System.out.println(
            MessageFormat.format(
                "{0} kick {1} character.",
                activeCharacter.getClass().getSimpleName(),
                passiveCharacter.getClass().getSimpleName()
            )
        );
    }

    private void showAfterRoundInfo() {
        System.out.println("\nStatus after round: ");
        showCharacterInfo(activeCharacter);
        showCharacterInfo(passiveCharacter);
    }
}
