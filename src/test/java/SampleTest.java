import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SampleTest {
    private final String[] validEmails = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    };

    private final String[] invalidEmails = {
            "abc",
            ".abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    };

    @Test
    public void testValidEmails() {
        for (String email : validEmails) {
            assertTrue(UserRegistrationRegex.Validator.validateEmail(email));
        }
    }

    @Test
    public void testInvalidEmails() {
        for (String email : invalidEmails) {
            assertFalse(UserRegistrationRegex.Validator.validateEmail(email));
        }
    }
}
