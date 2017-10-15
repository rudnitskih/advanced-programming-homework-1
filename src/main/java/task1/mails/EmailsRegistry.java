package task1.mails;

/**
 * Created by rudnitskih on 10/14/17.
 */
public interface EmailsRegistry {
    Class[] mailClasses = {
        BirthdayEmail.class,
        ConfirmEmail.class
    };
}
