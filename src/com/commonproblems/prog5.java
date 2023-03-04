package com.commonproblems;
//Write a Java program that keeps a number from the user and 
//generates an integer between 1 and 7 and 
//displays the name of the weekday.

import java.util.Scanner;

public class prog5 {

	public static void main(String[] args) 
	{
        /* int n;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input number: ");
       
        n=in.nextInt();
        
	
        switch (n) {
            case 1: System.out.println("sunday");
            break;
            case 2: System.out.println("Monday"); 
            break;
            case 3:  System.out.println("Tuesday");
            break;
            case 4:  System.out.println("Weday");
            break;
            case 5:  System.out.println("Thursday");
            break;
            case 6:  System.out.println("Friday");
            break;
            case 7:  System.out.println("Saturay");
            break;
            default: System.err.println("Invalid user");
        }*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter code");
		int n = sc.nextInt();
		if(n==1)
			System.out.println("day is MonDay");
		else if(n==2)
			System.out.println("Day is TuesDay");
		else if(n==3)
			System.out.println("Day is WednesDay");
		else if(n==4)
			System.out.println("Day is ThursDay");
		else if(n==5)
			System.out.println("Day is FriDay");
		else if(n==6)
			System.out.println("Day is SaturDay");
		else if(n==7)
			System.out.println("Day is SunDay");
		else
			System.out.println("Invalid code");
	}
}
		


    

        
 



