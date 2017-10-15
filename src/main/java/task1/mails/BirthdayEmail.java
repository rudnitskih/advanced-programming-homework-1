package task1.mails;

import lombok.Getter;

/**
 * Created by rudnitskih on 10/14/17.
 */
public class BirthdayEmail implements Mail {
    @Getter
    private Integer mailCode = 1;

    public void send() {
        System.out.println("Happy Birthday %username%");
    }
}
