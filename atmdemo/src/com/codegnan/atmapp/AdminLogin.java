package com.codegnan.atmapp;

import java.util.Scanner;

public class AdminLogin {
	Scanner sc=new Scanner(System.in);
	static final int pin=1234;
	
	public void viewUsers() throws InsuffisientRecords {
		
		
		if(ATMManager.index>0) {
		System.out.println("Accountant Details: ");
		for(int i=0;i<ATMManager.index;i++) {
			System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"USER NAME: "+ATMManager.ac[i].getUsername());
			System.out.println("LOCATION: "+ATMManager.ac[i].getLocation());
			System.out.println("ACCOUNT NUMBER: "+ATMManager.ac[i].getAccountNumber());
			
			System.out.println("BALANCE: "+ATMManager.ac[i].getBalance()+ConsoleColors.RESET);
		
			}
		  }
		else {
			throw new InsuffisientRecords(ConsoleColors.RED_BOLD_BRIGHT + "❌ NO RECORDS........" + ConsoleColors.RESET);
		}
		}
	
	
	public void delete() throws InsufficientUsers,InsuffisientRecords {
		
		if(ATMManager.index>0) {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"ENTER ACCOUNT NUMBER TO BE DELETED: ");
		long remove=sc.nextLong();
		boolean isfound = false;
		for(int i=0;i<ATMManager.index;i++) {
			if(remove==ATMManager.ac[i].getAccountNumber()) {
				for(int j=i;j<ATMManager.index-1;j++) {
					ATMManager.ac[j]=ATMManager.ac[j+1];					
				}
				ATMManager.ac[ATMManager.index-1]=null;
				ATMManager.index--;
				isfound = true;
				System.out.println(ConsoleColors. GREEN_BOLD_BRIGHT  + " SUCCESSFULLY DELETED USER......." + ConsoleColors.RESET);
			}
		   }
		if(!isfound) {
			throw new InsufficientUsers(ConsoleColors.RED_BOLD_BRIGHT+"❌ NO USER FOUND.....");
		}
		}
		else {
			throw new InsuffisientRecords(ConsoleColors.RED_BOLD_BRIGHT + "❌ NO RECORDS........" + ConsoleColors.RESET);
		}
	}
	
	public void login() {
		
	
		System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT + "ENTER YOUR AUTHENTICATION PIN:" + ConsoleColors.RESET);
		int aPin = sc.nextInt();
		if (pin == aPin) {
			System.out.println(ConsoleColors. GREEN_BOLD_BRIGHT  + "ADMIN SUCCESSFULLY LOGINED......." + ConsoleColors.RESET);
			while (true) {
				System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + "1. VIEW ALL USER ACCOUNTS.");
				System.out.println("2. DELETE SPECIFIC USER ACCOUNTS.");
				System.out.println("3. EXIT" + ConsoleColors.RESET);
				int option = sc.nextInt();

		
			switch(option) {
			case 1:
				try {
				viewUsers();
				}
				catch(InsuffisientRecords e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
				delete();
				}
				catch(InsufficientUsers | InsuffisientRecords a) {
					a.printStackTrace();
				}
				break;
			case 3:
				return;
			default: 
				System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "INVALID!..... SELECT A VALID OPTION." + ConsoleColors.RESET);
			}
				}
			}
		
	
		else {
			System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "❌ INVALID ACCOUNT NUMBER OR PIN!!!........." + ConsoleColors.RESET);
		}
	}

}
