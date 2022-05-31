package com.bridglabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static ArrayList<Contacts> contact_Details = new ArrayList<>();

    public static void addContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to save");
        int numberOfContacts = sc.nextInt();
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Enter the details of contact number " + (i + 1));
            System.out.println("Enter  first name");
            String firstName = sc.next();
            System.out.println("Last name");
            String lastName = sc.next();
            System.out.println("Enter address");
            String address = sc.next();
            System.out.println("Enter city ");
            String city = sc.next();
            System.out.println("Enter state ");
            String state = sc.next();
            System.out.println("Enter EmailId ");
            String emailId = sc.next();
            System.out.println("Enter zip ");
            int zipCode = sc.nextInt();
            System.out.println("Enter phone number ");
            int phoneNumber = sc.nextInt();
            System.out.println("Contact number " + (i + 1) + " saved");
            System.out.println("==================================");
            Contacts details = new Contacts(firstName, lastName, address, city, state, emailId, zipCode, phoneNumber);
            contact_Details.add(details);
        }
    }

    public static void showContacts() {
        int i = 1;
        for (Contacts contact : contact_Details) {
            System.out.println("Details  of contact number " + i + " is");
            System.out.println(contact.toString());
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Welcome to address book");
        System.out.println("================================");
        int i = 1;
        while (i != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to add contact or  Enter 2 for showing details of contacts");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    addContacts();
                    break;
                case 2:
                    showContacts();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}