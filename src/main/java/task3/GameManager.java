package task3;

import lombok.SneakyThrows;
import task3.characters.domain.Character;

import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class GameManager {
    private Character activeCharacter;
    private Character passiveCharacter;
    private Integer roundNumber;

    @SneakyThrows
    void fight(Character c1, Character c2) {
        System.out.println("Fight between: ");

        showCharacterInfo(c1);
        showCharacterInfo(c2);

        activeCharacter = c1;
        passiveCharacter = c2;
        roundNumber = 1;

        while (activeCharacter.isAlive()) {
            showBeforeRoundInfo();
            activeCharacter.kick(passiveCharacter);
            showAfterRoundInfo();

            Character temp = activeCharacter;
            activeCharacter = passiveCharacter;
            passiveCharacter = temp;

            roundNumber++;
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println(
            MessageFormat.format(
                "{0} win",
                passiveCharacter.getClass()
            )
        );
    }

    private void showCharacterInfo(Character character) {
        System.out.println(
            MessageFormat.format(
                "Type: {0}; Power: {1}; HP: {2}",
                character.getClass(),
                character.getPower(),
                character.getHp()
            )
        );
    }

    private void showBeforeRoundInfo() {
        System.out.println("\n Round number " + this.roundNumber.toString() + "\n" + "=========================");

        System.out.println(
            MessageFormat.format(
                "{0} kick {1} character",
                activeCharacter.getClass(),
                passiveCharacter.getClass()
            )
        );
    }

    private void showAfterRoundInfo() {
        showCharacterInfo(passiveCharacter);
    }
}
