package task3.characters.domain;

import utils.Utils;

import java.text.MessageFormat;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class RandomKicker {
    private Integer min;
    private Integer max;

    public RandomKicker(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public void randomKick(Character kicker, Character enemy) {
        Integer damage = Utils.getRandomInt(min, max);
        System.out.println(
            MessageFormat.format(
                "{0}: I will damage {1} on {2} HP.",
                kicker.getClass().getSimpleName(),
                enemy.getClass().getSimpleName(),
                damage
            )
        );

        enemy.decreaseHp(damage);
    }
}
