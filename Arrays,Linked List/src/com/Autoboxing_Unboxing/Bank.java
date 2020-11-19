package com.Autoboxing_Unboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branchIndex = this.branches.get(i);
            if (branchIndex.getName().equals(branchName)) {
                return branchIndex;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer List for branch -> " + branch.getName());
            ArrayList<Customer> customerList = branch.getCustomers();
            for (int i = 0; i < customerList.size(); i++) {
                Customer customer = customerList.get(i);
                System.out.println((i + 1) + ". Customer Name -> " + customer.getName());
                if (showTransactions) {
                    System.out.println("Transactions :");
                    ArrayList<Double> transaction = customer.getTransactions();
                    for (int j = 0; j < transaction.size(); j++) {
                        System.out.println("    "+(j + 1) + ". Amount " + transaction.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
