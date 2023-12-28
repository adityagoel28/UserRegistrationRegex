package UserRegistrationRegex;

public class Regex {
    public static final String FIRST_NAME_PATTERN = "^[A-Z][A-Za-z]{2,}$";
    public static final String LAST_NAME_PATTERN = "^[A-Z][A-Za-z]{2,}$";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,4}){1,2}$";
    public static final String MOBILE_PATTERN = "^[0-9]{2}\\s[0-9]{10}$";
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d).{8,}$\n";

}
