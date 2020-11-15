package com.ArrayList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0333 5544 8848");

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        startPhone();
        printOptions();
        while (!quit) {
            System.out.println("\nEnter your Options :");
            int action= scanner.nextInt();
            scanner.nextLine();
            quit=true;

            /*switch (action){
                case 0:
            }*/
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printOptions() {
        System.out.println("\nAvailable actions :\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contact\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query an existing contact\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action : ");
    }
}
