package UserRegistrationRegex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("User Registration Regex Program!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();
        System.out.println("First Name Valid: " + Validator.validateFirstName(firstName)); // validates first name

        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();
        System.out.println("Last Name Valid: " + Validator.validateLastName(lastName)); // validates last name

        System.out.println("Enter Email:");
        String email = sc.nextLine();
        System.out.println("Email Valid: " + Validator.validateEmail(email)); // validates email

        System.out.println("Enter Mobile Number:");
        String mobile = sc.nextLine();
        System.out.println("Mobile Valid: " + Validator.validateMobile(mobile)); // validates mobile number
    }
}
