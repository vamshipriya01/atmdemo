package com.codegnan.atmapp;

import java.util.Scanner;

//Application class - Main class

public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ATMManager am=new ATMManager();
		AdminLogin al=new AdminLogin();
		AccountLogin aclogin=new AccountLogin();
		
		while(true) {
			System.out.println(ConsoleColors. BLUE_BOLD_BRIGHT  + "1. ACCOUNT CREATION");
			System.out.println("2. ADMIN LOGIN");
			System.out.println("3. ACCOUNT LOGIN");
			System.out.println("4. EXIT" + ConsoleColors.RESET);
			int option=sc.nextInt();
			
			switch(option) {
			case 1:
				
				am.addUser();
				break;
			case 2:
				al.login();
				break;
			case 3:
				aclogin.accountLogin();
				break;
			
			case 4:
				return;
			default: 
				System.out.println(ConsoleColors. RED_BOLD_BRIGHT  + "INVALID!..... SELECT A VALID OPTION." + ConsoleColors.RESET);
			}
			}
	
	}

}
