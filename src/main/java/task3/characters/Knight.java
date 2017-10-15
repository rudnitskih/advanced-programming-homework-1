package task3.characters;

import lombok.Getter;
import lombok.Setter;
import task3.characters.domain.Character;
import task3.characters.domain.RandomKicker;
import utils.Utils;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class Knight extends Character {
    @Getter
    @Setter
    private Integer power;

    @Getter
    @Setter
    private Integer hp;

    private RandomKicker randomKicker;

    public Knight() {
        Integer min = 2;
        Integer max = 12;

        this.power = Utils.getRandomInt(min, max);
        this.hp = Utils.getRandomInt(min, max);
        this.randomKicker = new RandomKicker(min, max);
    }

    public void kick(Character enemy) {
        randomKicker.randomKick(this, enemy);
    }
}
