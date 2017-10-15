package task3.characters.domain;

import task3.characters.interfaces.Alive;
import task3.characters.interfaces.Fighter;
import task3.characters.interfaces.Kicker;

/**
 * Created by rudnitskih on 10/15/17.
 */
public abstract class Character implements Kicker, Alive, Fighter {
    private Integer hp;

    abstract public Integer getHp();

    abstract public void setHp(Integer newHp);

    public boolean isAlive() {
        return this.getHp() > 0;
    }

    public Character decreaseHp(Integer damage) {
        this.setHp(this.getHp() - damage);

        return this;
    }
}
