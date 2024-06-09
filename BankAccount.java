/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

/**
 *
 * @author hp
 */
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of tk" + amount + " successful. Current balance: tk" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of tk" + amount + " successful. Current balance: tk" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("BA001", 100000.0);
        System.out.println("Initial balance: tk" + account1.getBalance());

        account1.deposit(50000.0);
        account1.withdraw(25000.0);

        BankAccount account2 = new BankAccount("BA002", 50000.0);
        System.out.println("Initial balance: tk" + account2.getBalance());

        account2.deposit(10000.0);
        account2.withdraw(6000.0);
    }
}
