package UserRegistrationRegex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("User Registration Regex Program!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();
        System.out.println("First Name Valid: " + Validator.validateFirstName(firstName)); // validates first name
    }
}
