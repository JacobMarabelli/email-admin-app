package com.emailadminapp;
import java.util.UUID;
import java.util.Scanner;

public class NewHire {
    private String firstName = "";
    private String lastName = "";
    private Department department = Department.NONE;
    private String company = "";
    private String emailAddress = " ";
    private int mailboxCapacity = 0;
    private String password = "";

    //Generates a random UUID password for the email account
    public static String generatePassword() { //make private?
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }

    //Enum of all department types
    enum Department {SALES, DEVELOPMENT, ACCOUNTING, NONE};

    //Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Department getDepartment() {
        return department;
    }
    public String getCompany() {
        return company;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPassword() { return password;}
    public int getMailboxCapacity() { return mailboxCapacity;}

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPassword(String uuid) {
        this.password = uuid;
    }
    public void setMailboxCapacity(int capacity) {this.mailboxCapacity = capacity;}

    //Default Constructor
    NewHire() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        setFirstName(scanner.nextLine());
        System.out.println("What is your last name?");
        setLastName(scanner.nextLine());
        System.out.println("Enter department code: ");
        System.out.println("DEPARTMENT CODES:");
        System.out.println("1 - Sales");
        System.out.println("2 - Development");
        System.out.println("3 - Accounting");
        System.out.println("4 - None");
        int departmentCode = scanner.nextInt();
        if(departmentCode == 1) {
            setDepartment(Department.SALES);
        } else if (departmentCode == 2) {
            setDepartment(Department.DEVELOPMENT);
        } else if(departmentCode == 3) {
            setDepartment(Department.ACCOUNTING);
        } else {
            setDepartment(Department.NONE);
        }
        System.out.println("What is your company's name?");
        setCompany(scanner.next());
    };
}
