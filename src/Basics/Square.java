package Basics;

import java.util.Scanner;

public class Square {

	//1.Take values of length and breadth of a rectangle from user and 
	//check if it is square or not.
	public static void main(String[] args) 
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value for breath");
	int x=	sc.nextInt();
	
	System.out.println("enter value for length");
	int y= sc.nextInt();
	
	if(x==y) 
		System.out.println("It is square");
	else
		System.out.println(" It is not a Square");
	}

}
	
	
	
	
	
	
	
	
	

