package task3;

import lombok.SneakyThrows;
import task3.characters.Elf;
import task3.characters.Hobbit;
import task3.characters.King;
import task3.characters.Knight;
import task3.characters.domain.Character;
import utils.Utils;

/**
 * Created by rudnitskih on 10/15/17.
 */
class CharacterFactory {
    private Class[] characterClasses = {
        Hobbit.class,
        Elf.class,
        King.class,
        Knight.class
    };

    @SneakyThrows
    CharacterFactory() {
        for (Class characterClass : this.characterClasses) {
            if (!Character.class.isAssignableFrom(characterClass)) {
                throw new Exception(characterClass + " should inherit " + Character.class + " class.");
            }
        }

    }

    @SneakyThrows
    Character createCharacter() {
        Integer randomInt = Utils.getRandomInt(characterClasses.length);

        return (Character) characterClasses[randomInt].newInstance();
    }
}
