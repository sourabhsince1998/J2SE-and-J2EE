package Basics;
//"4.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount."
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int experience=0; 
		//double experienceM=0.0;
		double salary=0.0;
		String name;  
		
		System.out.println("Enter Your  Name");
		name=sc.next();
		
		
		System.out.println("Enter Your Job Experience");
		experience=sc.nextInt() ;
		
		/*try
		{
		experienceM=sc.nextDouble();
		}
				catch(Exception e)
		{
				System.err.println("Plz enter your Job Experience  in years");	
		}*/
		
		System.out.println("Enter Your salary ");
		salary=sc.nextDouble();
		
		
		
		if(experience>5 )
		
			System.out.println("Congrats Mr/Ms "+name+" Your Bonus is "+salary*5/100);
		
		else
		    
			System.out.println("Hey Sorry Mr/Ms "+name+" You Wont receive any Bonus bcz Still u have to serve till 5 years complete");
	}
}

