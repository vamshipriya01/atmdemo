package com.codegnan.atmapp;

public class InsufficientBalance extends Exception{
	InsufficientBalance(String message){
		super(message);
	}
}
