package com.designPattern;

public class AccountMain {

	public static void main(String[] args) 
	{
		AccountSingleton.createObject();
		AccountSingleton.createObject();
		AccountSingleton.createObject();
	}
}

