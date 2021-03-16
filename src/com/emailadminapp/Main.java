/* Created by Jacob Marabelli on March 15, 2021*/
package com.emailadminapp;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sets up basic user info for user
        NewHire newHire = new NewHire();

        //Create an email address for the user that follows this syntax: firstname.lastname@department.company.com
        System.out.println("Creating your work email account...");
        newHire.setEmailAddress(String.format("%s.%s@%s.%s.com",
                newHire.getFirstName(), newHire.getLastName(),
                newHire.getDepartment().toString(), newHire.getCompany()));
        System.out.println("Your new email address is: " + newHire.getEmailAddress().toLowerCase());

        //Set the capacity of the user's email inbox
        System.out.println("Enter preferred mailbox capacity (in MB): ");
        newHire.setMailboxCapacity(scanner.nextInt());
        System.out.println("Mailbox capacity set to: " + newHire.getMailboxCapacity() + "MB");

        //Generate a random UUID password for the user's email account
        System.out.println("Generating a secure password for your new email...");
        newHire.setPassword(newHire.generatePassword());

        //Allow user the choice to set their own password
        System.out.println("Password created. Would you like to set a custom password?");
        String customPasswordChoice = scanner.next().toLowerCase();
        switch (customPasswordChoice) {
            case "yes": {
                System.out.println("Enter your custom password:");
                newHire.setPassword(scanner.next());
                System.out.println("Your password has been updated.");
                break;
            } default: {
                break;
            }
        }

        //Display the info for the user's newly created account
        System.out.println("Account setup is finished.");
        System.out.println("----------------------------");
        System.out.println("Account owner: " + newHire.getFirstName() + " " + newHire.getLastName());
        System.out.println("Email Address: " + newHire.getEmailAddress().toLowerCase());
        System.out.println("Password: " + newHire.getPassword());
        System.out.println("Mailbox capacity: " + newHire.getMailboxCapacity() + "MB");

    }
}
