package task3.characters.domain;

import task3.characters.interfaces.Kicker;
import task3.utils.Utils;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class RandomKicker implements Kicker {
    private Integer min;
    private Integer max;

    public RandomKicker(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public void kick(Character enemy) {
        enemy.decreaseHp(Utils.getRandomInt(min, max));
    }
}
