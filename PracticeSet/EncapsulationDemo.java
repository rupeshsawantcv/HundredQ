package com.Try;

import java.util.Scanner;

class Account {
    private String accountHolderName;
    private int accountNumber;
    private double accountBalance;
    private int pin; // ✅ Changed to int

    public Account(String name, int accNum, double balance, int myPin) {
        this.accountHolderName = name;
        this.accountNumber = accNum;
        this.accountBalance = balance;
        this.pin = myPin;
        
    }

    public String getAccountHolderInfo() {
        return "Account Holder Name: " + accountHolderName + ", Account Number: " + accountNumber;
    }

    public String getBalance(int enterPin) { // ✅ PIN is int
        if (this.pin == enterPin) { // ✅ Compare ints with ==
            return "Account Balance is: " + accountBalance;
        } else {
            return "Wrong PIN! Access Denied.";
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ✅ PIN is now an int
        Account myAccount = new Account("Rupesh", 123456, 1000.50, 1816);

        System.out.println(myAccount.getAccountHolderInfo());

        System.out.print("Enter PIN to get Balance: ");
        int enterPin = sc.nextInt(); // ✅ PIN should be int

        System.out.println(myAccount.getBalance(enterPin)); // ✅ Print the result

        sc.close(); // ✅ Close scanner to prevent memory leaks
    }
}
