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

    @Test
    public void testFirstNameValid() {
        assertTrue(UserRegistrationRegex.Validator.validateFirstName("Aditya"));
        assertFalse(UserRegistrationRegex.Validator.validateFirstName("ad"));
    }

    @Test
    public void testLastNameValid() {
        assertTrue(UserRegistrationRegex.Validator.validateLastName("Goel"));
        assertFalse(UserRegistrationRegex.Validator.validateLastName("goel"));
    }

    @Test
    public void testEmailValid() {
        assertTrue(UserRegistrationRegex.Validator.validateEmail("adityagoel2002@gmail.com"));
        assertFalse(UserRegistrationRegex.Validator.validateEmail("adityagoel2002@gmail"));
    }

    @Test
    public void testMobileValid() {
        assertTrue(UserRegistrationRegex.Validator.validateMobile("91 1234567890"));
        assertFalse(UserRegistrationRegex.Validator.validateMobile("911234567890"));
    }

    @Test
    public void testPasswordValid() {
        assertTrue(UserRegistrationRegex.Validator.validatePassword("Aditya@123"));
        assertFalse(UserRegistrationRegex.Validator.validatePassword("aditya123"));
    }
}
