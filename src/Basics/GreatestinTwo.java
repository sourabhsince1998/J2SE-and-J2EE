package Basics;
//2.Take two int values from user and print greatest among them.
import java.util.Scanner;

public class GreatestinTwo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		
		System.out.println("enter b value");
		int b=sc.nextInt();
		
		
		if(a>b) 
			System.out.println("a is greatest");
		else
		System.out.println("b is greatest");
			
		
	} 

}
