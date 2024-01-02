package UserRegistrationRegex;

import java.util.regex.Pattern;

public class Validator {
    public static void validateFirstName(String firstName) throws UserValidationException {
        if (!Pattern.matches(Regex.FIRST_NAME_PATTERN, firstName)) {
            throw new UserValidationException("Invalid First Name");
        }
    }

    public static void validateLastName(String lastName) throws UserValidationException {
        if (!Pattern.matches(Regex.LAST_NAME_PATTERN, lastName)) {
            throw new UserValidationException("Invalid Last Name");
        }
    }

    public static void validateEmail(String email) throws UserValidationException {
        if (!Pattern.matches(Regex.EMAIL_PATTERN, email)) {
            throw new UserValidationException("Invalid Email");
        }
    }

    public static void validateMobile(String mobile) throws UserValidationException {
        if (!Pattern.matches(Regex.MOBILE_PATTERN, mobile)) {
            throw new UserValidationException("Invalid Mobile Number");
        }
    }

    public static void validatePassword(String password) throws UserValidationException {
        if (!Pattern.matches(Regex.PASSWORD_PATTERN, password)) {
            throw new UserValidationException("Invalid Password");
        }
    }
}
