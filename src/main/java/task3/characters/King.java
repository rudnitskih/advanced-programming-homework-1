package task3.characters;

import lombok.Getter;
import lombok.Setter;
import task3.characters.domain.Character;
import task3.characters.domain.RandomKicker;
import task3.utils.Utils;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class King extends Character {
    @Getter
    @Setter
    private Integer power;

    @Getter
    @Setter
    private Integer hp;

    private RandomKicker randomKicker;

    public King() {
        this.power = Utils.getRandomInt(5, 15);
        this.hp = Utils.getRandomInt(5, 15);
        this.randomKicker = new RandomKicker(5, 15);
    }

    public void kick(Character enemy) {
        randomKicker.kick(enemy);
    }
}
