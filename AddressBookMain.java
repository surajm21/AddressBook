package com.bridglabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    static ArrayList<Contacts> contactDetails = new ArrayList<>();
    static HashMap<String, AddressBookMain> addressBooks = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void addContacts() {
        System.out.println("Enter the number of contacts you want to save");
        int numberOfContacts = sc.nextInt();
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Enter the details of contact number " + (i + 1));
            System.out.println("Enter first name");
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
            Contacts details = new Contacts( firstName, lastName, address, city, state, emailId, zipCode, phoneNumber);
            contactDetails.add(details);
        }
    }

    public static void showContacts() {
        int i = 1;
        for (Contacts contact : contactDetails) {
            System.out.println("Details  of contact number " + i + " is");
            System.out.println(contact.toString());
            i++;
        }
    }

    public static void editContacts(String name) {
        for (Contacts contact : contactDetails) {
            if (name.equalsIgnoreCase(contact.firstName)) {
                System.out.println("Entered Name found in the contacts");
                System.out.println("Enter the updated first name");
                String firstName=sc.next();
                contact.setFirstName(firstName);
                System.out.println("Enter the updated last name");
                String lastName=sc.next();
                contact.setLastName(lastName);
                System.out.println("Enter the updated address");
                String address=sc.next();
                contact.setAddress(address);
                System.out.println("Enter the updated city");
                String city=sc.next();
                contact.setCity(city);
                System.out.println("Enter the updated state");
                String state = sc.next();
                contact.setState(state);
                System.out.println("Enter the updated emailID");
                String emailId = sc.next();
                contact.setEmailId(emailId);
                System.out.println("Enter the updated zipcode");
                int zipcode = sc.nextInt();
                contact.setZipCode(zipcode);
                System.out.println("Enter the updated phoneNumber");
                int phoneNumber = sc.nextInt();
                contact.setPhoneNumber(phoneNumber);
            } else
                System.out.println("Entered name not  found in the AddressBook");
        }
    }

    public static void deleteContact(String name) {
        for (Contacts contact : contactDetails) {
            if (name.equalsIgnoreCase(contact.firstName)) {
                System.out.println("Entered Name found in the contacts, deleting contact");
                contactDetails.remove(contact);
            }
            else
                System.out.println("Entered name not found in the AddressBook");
        }
    }
    
    public static void main(String[] args) {
        AddressBookMain book1 = new AddressBookMain();
        AddressBookMain book2 = new AddressBookMain();
        AddressBookMain book3 = new AddressBookMain();
        addressBooks.put("AddressBook1", book1);
        addressBooks.put("AddressBook2", book2);
        addressBooks.put("AddressBook3", book3);
        System.out.println("================================");
        System.out.println("Welcome to Address Book");
        System.out.println("================================");
        int i = 1;
        while (i != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to add contact\nEnter 2 to edit details of contacts\nEnter 3 for deleting contact\nEnter 4 for showing details of contacts ");
            System.out.println(".......................................");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Enter 1 to for AddressBook1 \n 2 for AddressBook2 \n 3 for AddressBook3");
                    int choice = sc.nextInt();
                    if (choice == 1) book1.addContacts();
                    else if (choice == 2) book2.addContacts();
                    else if (choice == 3) book3.addContacts();
                    else System.out.println("Option not found");
                    break;
                case 2:
                    System.out.println("Enter the first name by which u want to edit contact");
                    String name = sc.next();
                    editContacts(name);
                    break;
                case 3:
                    System.out.println("Enter the first name by which u want to edit contact");
                    String search_Name = sc.next();
                    deleteContact(search_Name);
                    break;
                case 4:
                    showContacts();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}