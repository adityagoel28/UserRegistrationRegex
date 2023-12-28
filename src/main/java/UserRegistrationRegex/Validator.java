package UserRegistrationRegex;

import java.util.regex.Pattern;

public class Validator {
    public static boolean validateFirstName(String firstName) {
        return Pattern.matches(Regex.FIRST_NAME_PATTERN, firstName);
    }
}
