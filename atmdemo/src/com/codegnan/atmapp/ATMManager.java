package com.codegnan.atmapp;
import java.util.Scanner;


public class ATMManager {
	static Account_Creation ac[]=new Account_Creation[5];
	static int index=0;
	
	public  void addUser() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "ENTER THE USER NAME: " + ConsoleColors.RESET);
    String name = sc.next();
    sc.nextLine();

    System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "ENTER THE LOCATION: " + ConsoleColors.RESET);
    String location = sc.next();
    sc.nextLine();

    System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ "ENTER THE ACCOUNT NUMBER: " + ConsoleColors.RESET);
    long acNo = sc.nextLong();
    sc.nextLine();

    System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "ENTER PIN: " + ConsoleColors.RESET);
    int pin = sc.nextInt();

    System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ "ENTER BALANCE: " + ConsoleColors.RESET);
    double balance = sc.nextDouble();

    Account_Creation a = new Account_Creation(name, location, acNo, pin, balance);
    ac[index++] = a;
    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+ "✅ ACCOUNT IS SUCCESSFULLY CREATED.........." + ConsoleColors.RESET);
	}
	

		
	}
	

