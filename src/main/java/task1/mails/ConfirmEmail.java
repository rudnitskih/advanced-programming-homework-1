package task1.mails;

import lombok.Getter;

/**
 * Created by rudnitskih on 10/14/17.
 */
public class ConfirmEmail implements Mail {
    @Getter
    private Integer mailCode = 2;

    public void send() {
        System.out.println("Thank you for joining, %username%");
    }
}
