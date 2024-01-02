package UserRegistrationRegex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class SampleTest {
    // Valid email addresses
    private static Stream<String> validEmailProvider() {
        return Stream.of(
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        );
    }

    // Invalid email addresses
    private static Stream<String> invalidEmailProvider() {
        return Stream.of(
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
        );
    }

    @Test
    public void testFirstNameValid() {
        assertDoesNotThrow(() -> Validator.validateFirstName("Aditya"));
        assertThrows(UserValidationException.class, () -> Validator.validateFirstName("ad"));
    }

    @Test
    public void testLastNameValid() {
        assertDoesNotThrow(() -> Validator.validateLastName("Goel"));
        assertThrows(UserValidationException.class, () -> Validator.validateLastName("goel"));
    }

    @Test
    public void testMobileValid() {
        assertDoesNotThrow(() -> Validator.validateMobile("91 1234567890"));
        assertThrows(UserValidationException.class, () -> Validator.validateMobile("911234567890"));
    }

    @Test
    public void testPasswordValid() {
        assertDoesNotThrow(() -> Validator.validatePassword("Aditya@123"));
        assertThrows(UserValidationException.class, () -> Validator.validatePassword("aditya123"));
    }

    @ParameterizedTest
    @MethodSource("validEmailProvider")
    public void testValidEmails(String email) {
        assertDoesNotThrow(() -> Validator.validateEmail(email));
    }

    @ParameterizedTest
    @MethodSource("invalidEmailProvider")
    public void testInvalidEmails(String email) {
        assertThrows(UserValidationException.class, () -> Validator.validateEmail(email));
    }
}
