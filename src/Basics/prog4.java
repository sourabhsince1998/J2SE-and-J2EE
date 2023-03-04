package Basics;

import java.util.Scanner;

/*"3A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user."*/
public class prog4 {

	public static void main(String[] args) 
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost");
		 c=sc.nextInt();
		if(c>1000)
			
			 //c=c*10/100;
		System.out.println("The total cost will be "+(c-(c/100*10)));
		else
	       System.out.println("the total cost will be "+c);
		
	}

}
