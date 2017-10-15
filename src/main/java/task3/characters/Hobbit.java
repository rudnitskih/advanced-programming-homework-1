package task3.characters;

import lombok.Getter;
import lombok.Setter;
import task3.characters.domain.Character;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class Hobbit extends Character {
    @Getter
    @Setter
    private Integer power = 0;

    @Getter
    @Setter
    private Integer hp = 3;

    public void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit: I don't want to kill you, I am peaceful hobbit.");
    }
}
