package UserRegistrationRegex;

import java.util.regex.Pattern;

public class Validator {
    public static boolean validateFirstName(String firstName) {
        return Pattern.matches(Regex.FIRST_NAME_PATTERN, firstName);
    }

    public static boolean validateLastName(String lastName) {
        return Pattern.matches(Regex.LAST_NAME_PATTERN, lastName);
    }

    public static boolean validateEmail(String email) {
        return Pattern.matches(Regex.EMAIL_PATTERN, email);
    }
}
