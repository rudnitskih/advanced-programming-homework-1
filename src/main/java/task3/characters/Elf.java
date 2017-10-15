package task3.characters;

import lombok.Getter;
import lombok.Setter;
import task3.characters.domain.Character;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class Elf extends Character {
    @Getter
    @Setter
    private Integer hp = 10;

    @Getter
    @Setter
    private Integer power = 10;

    public void kick(Character enemy) {
        if (enemy.getPower() < this.power) {
            System.out.println("Elf: I will kill you little bastard. Hahaha.");
            enemy.setHp(0);
        } else {
            System.out.println("Elf: You are stronger than me. I will damage you on 1 HP.");
            enemy.decreaseHp(1);
        }
    }
}
