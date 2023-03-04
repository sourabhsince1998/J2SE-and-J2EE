package com.commonproblems;

import java.util.Scanner;

//Take three numbers from the user and 
//print the greatest number
public class Prog3 {

	public static void main(String[] args) {
		/*int a=25;
		int b=78;
		int c=87;*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value for a");
		
		int a=sc.nextInt();
		

		System.out.println("enter value for b");
		
		int b=sc.nextInt();
		

		System.out.println("enter value for c");
		
		int c=sc.nextInt();
		
		
		
		if(a>b && a>c)
			System.out.println(a+" is greatest");
		
		else if(b>c && b>a)
			System.out.println(b+" is greatest");
		
		else
			System.out.println(c+" is greatest");
	}

}
