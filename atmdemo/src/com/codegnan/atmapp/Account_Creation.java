package com.codegnan.atmapp;

public class Account_Creation {

	private String username;
    private String location;
    private long accountNumber;
    private int pin;
    private double balance;
    
    //Constructor and Getters/Setters1
   


	public Account_Creation(String name, String location2, long acNo, int pin2, double balance2) {
		this.username = name;
		this.location = location2;
		this.accountNumber = acNo;
		this.pin = pin2;
		this.balance = balance2;
			
		
	}
	public Account_Creation() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
    


}
