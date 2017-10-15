package utils;

import java.util.Random;

/**
 * Created by rudnitskih on 10/15/17.
 */
public class Utils {
    public static Integer getRandomInt(Integer max) {
        return new Random().nextInt(max);
    }

    public static Integer getRandomInt(Integer min, Integer max) {
        return new Random().nextInt(max - min) + min;
    }
}
