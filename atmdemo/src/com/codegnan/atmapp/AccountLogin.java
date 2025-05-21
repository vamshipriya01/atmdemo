package com.codegnan.atmapp;

import java.util.Scanner;

public class AccountLogin {
	Scanner sc=new Scanner(System.in);
	Account_Creation ac = new Account_Creation();
	int index=0;

	public void accountLogin() {
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + "ENTER YOUR ACCOUNT NUMBER:" + ConsoleColors.RESET);
		long givenNo = sc.nextLong();
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"ENTER YOUR PIN:");
		int givenPin = sc.nextInt();
		for(int i=0;i<ATMManager.index;i++) {
		if(((ATMManager.ac[i].getAccountNumber()==givenNo) && (ATMManager.ac[i].getPin())==givenPin)){
			index=i;
			System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "✅ SUCCESSFULLY LOGINED TO YOUR ACCOUNT!!!!!......" + ConsoleColors.RESET);
			 while(true) {
				 System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+ "1. DEPOSIT");
					System.out.println("2. WITHDRAW");
					System.out.println("3. CHECK BALANCE");
					System.out.println("4. EXIT" + ConsoleColors.RESET);
					int option = sc.nextInt();
					
					switch(option) {
					case 1:
						try {
							 deposit();
						}
						catch(InsufficientBalance e) {
							e.printStackTrace();
						}
							 break;
					case 2:
						try {
							 withdraw();
					}
					catch(InsufficientBalance e) {
						e.printStackTrace();
					}
						
							 break;
					case 3:
						  checkBalance();
						  break;
					case 4:
							return;
					default: 
						System.out.println(ConsoleColors.RED_BOLD_BRIGHT+ "INVALID!..... SELECT A VALID OPTION." + ConsoleColors.RESET);
					}
				}
		}
		else {
			System.out.println(ConsoleColors.RED_BOLD_BRIGHT+ "❌ INVALID ACCOUNT NUMBER OR PIN!!!........." + ConsoleColors.RESET);
		}
	}
		
		
}

	private void deposit() throws InsufficientBalance{
		// TODO Auto-generated method stub
		System.out.println(ConsoleColors.BLACK_BOLD_BRIGHT+"ENTER AMOUNT TO BE DEPOSITED: ");
		 double depositAmount=sc.nextDouble();
		 if(depositAmount%100==0 && depositAmount>0) {
		double deposit=ATMManager.ac[index].getBalance()+depositAmount;
		ATMManager.ac[index].setBalance(deposit);
		System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"✅ YOU HAVE SUCCESSFULLY DEPOSITED........");
	
		
		 }
		 else {
			  throw new InsufficientBalance(ConsoleColors.RED_BOLD_BRIGHT + "❌ " + "ONLY ACCEPTS VALID AMOUNTS IN MULTIPLES OF 100 AND AMOUNT SHOULD BE POSITIVE.\r\n"
			  		+ "" + ConsoleColors.RESET);
			 
		 
	}
	}
	
	public void withdraw() throws InsufficientBalance{
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"ENTER AMOUNT TO BE WITHDRAW: ");
		 double amount=sc.nextDouble();
		if( amount%100==0 && amount<ATMManager.ac[index].getBalance()) {
			
			double withdraw=ATMManager.ac[index].getBalance()-amount;
			ATMManager.ac[index].setBalance(withdraw);
			System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"✅ YOU HAVE SUCCESSFULLY WITHDRAWED AMOUNT........");
		
			}
		
			else {
				  throw new InsufficientBalance(ConsoleColors.RED_BOLD_BRIGHT + "❌ " + "ONLY ACCEPTS VALID AMOUNTS IN MULTIPLES OF 100 AND AMOUNT SHOULD BE GREATER THAN BALANCE.\r\n"
					  		+ "" + ConsoleColors.RESET);
			}
}
	
	
	public void checkBalance() {
		
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + "⚠️ YOUR CURRENT BALANCE: " + ATMManager.ac[index].getBalance() + ConsoleColors.RESET);
		
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	



