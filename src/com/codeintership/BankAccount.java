package com.codeintership;

public class BankAccount{

 private double balance;

	    public BankAccount() {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance!");
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	


