package Normal;

import java.util.Scanner;

public class Account 
{
	public static void main(String[] args) {
		
		int balance=10000;
		System.out.println("Enter amount to be withdrawen ");
		Scanner sc =new Scanner(System.in);
		int amount=sc.nextInt();
		
		if(amount<balance) {
			System.out.println("amount withdrawed succesfully "+amount+"Rs");
		}
		else {
			try{
				throw new InsufficientBalanceException ();
				
			}
			catch (InsufficientBalanceException e) {
				System.err.println("Not enough balance to withdraw");
			}
		}
	}

}
