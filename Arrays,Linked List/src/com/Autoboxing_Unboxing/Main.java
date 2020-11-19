package com.Autoboxing_Unboxing;

public class Main {
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    public static void main(String[] args) {
        Bank bank = new Bank("SBI");

        bank.addBranch("Kolkata");
        bank.addCustomer("Kolkata", "Sourav", 1000.50);
        bank.addCustomer("Kolkata", "Jhon", 500.50);
        bank.addCustomer("Kolkata", "Ram", 100.00);

        bank.addBranch("Delhi");
        bank.addCustomer("Delhi", "Sourav Saha", 1000.50);

        bank.addCustomerTransaction("Kolkata","Sourav",500.50);
        bank.addCustomerTransaction("Kolkata","Ram",200.00);
        bank.addCustomerTransaction("Delhi","Sourav Saha",400.50);

        bank.listCustomer("Kolkata",true);
        bank.listCustomer("Delhi",true);
    }
}
