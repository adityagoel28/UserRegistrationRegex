package UserRegistrationRegex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("User Registration Regex Program!");

            System.out.println("Enter First Name:");
            String firstName = sc.nextLine();
            Validator.validateFirstName(firstName);
            System.out.println("First Name is valid.");

            System.out.println("Enter Last Name:");
            String lastName = sc.nextLine();
            Validator.validateLastName(lastName);
            System.out.println("Last Name is valid.");

            System.out.println("Enter Email:");
            String email = sc.nextLine();
            Validator.validateEmail(email);
            System.out.println("Email is valid.");

            System.out.println("Enter Mobile Number:");
            String mobile = sc.nextLine();
            Validator.validateMobile(mobile);
            System.out.println("Mobile Number is valid.");

            System.out.println("Enter Password:");
            String password = sc.nextLine();
            Validator.validatePassword(password);
            System.out.println("Password is valid.");

        } catch (UserValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
