package task1;

import task1.mails.BirthdayEmail;
import task1.mails.ConfirmEmail;

/**
 * Created by rudnitskih on 10/14/17.
 */
public interface EmailsRegistry {
    Class[] mailClasses = {
        BirthdayEmail.class,
        ConfirmEmail.class
    };
}
