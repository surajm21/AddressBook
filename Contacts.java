package com.bridglabz.addressbook;

public class Contacts {

    String firstName, lastName, address, city, state, emailId;
    int zipCode, phoneNumber;
    public Contacts(String firstName, String lastName, String address, String city, String state, String emailId, int zipCode, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }
    public String toString () {
        return "----------------------------------\n" +
                "FirstName  =  " + firstName +
                "\nLastName   =  " + lastName +
                "\nAddress    =  " + address +
                "\nCity       =  " + city +
                "\nState      =  " + state +
                "\nZipCode    =  " + zipCode +
                "\nNumber     =  " + phoneNumber +
                "\nEmail      =  " + emailId +
                "\n-----------------------------------\n"
                ;
    }
}
