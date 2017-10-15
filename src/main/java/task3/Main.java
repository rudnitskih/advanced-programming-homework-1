package task3;

import task3.characters.domain.Character;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        CharacterFactory characterFactory = new CharacterFactory();
        Character fighter1 = characterFactory.createCharacter();
        Character fighter2 = characterFactory.createCharacter();

        gameManager.fight(fighter1, fighter2);
    }
}
