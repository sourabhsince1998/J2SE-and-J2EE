package com.designPattern;

public class AccountSingleton 
{
	private static AccountSingleton obj=null;
	
	private AccountSingleton()
	{
		System.out.println("Account created");
	}
	public static void createObject()
	{
		if(obj==null)
		{
			obj=new AccountSingleton();
		}
		else
		{
			System.out.println("Cannot create Account!! Already Created");
		}
	}

}
