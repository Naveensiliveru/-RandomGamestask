package com.codeintership;

import java.util.Scanner;

public class ATM {

	
	  private BankAccount account;

	public ATM(BankAccount account) {
		super();
		this.account = account;
	}
	   
	
	 public void displayMenu() {
		  System.out.println("\n ATM MENU");
		  
		   System.out.println("1 . Check Balance");
		   System.out.println(" 2 . Deposit");
		   System.out.println("3. Withdraw");
		   System.out.println("4. Exit");
		   
	 }
	 
	 
	  public void start() {
		  
		 Scanner sc = new Scanner(System.in);
		   boolean exite= false;
		   
		   
		   while (!exite) {
	            displayMenu();
	            System.out.print("Choose an option (1-4): ");
	            String choice = sc.nextLine();
	            
	            
	            switch (choice) {
                case "1":
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case "2":
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    sc.nextLine(); // Consume the newline
                    break;
                case "3":
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    sc.nextLine(); // Consume the newline
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exite = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        sc.close();
    }
	  
	 
}

