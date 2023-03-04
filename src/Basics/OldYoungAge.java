package Basics;

import java.util.Scanner;

public class OldYoungAge {
//6.Take input of age of 3 people by user and
//determine oldest and youngest among them
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Person age");
		int age1=sc.nextInt();
		
		System.out.println("Enter Second Person age"); 
		int age2=sc.nextInt();
		
		System.out.println("Enter Third Person age");
		int age3=sc.nextInt();
		 
		if(age1>age2 && age1>age3)
		System.out.println("First Person is Older");
		
		else if(age2>age1 && age2>age3)
		System.out.println("Second Person is Older");
		
		else
		System.out.println("Third Person is Older");
			
	
	}

} 
