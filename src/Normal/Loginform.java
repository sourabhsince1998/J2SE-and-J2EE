package Normal;

import java.util.Scanner;

public class Loginform {

	
	public static void main(String[] args) 
	
{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter user id");
		String id=sc.next();	
		System.out.println("enter password");
		int password=sc.nextInt();
		if (id.equals("admin"))
		{
			if(password==123)
			{
				System.out.println("login Succesfull");
			}
			else {
				try {
					InvalidPasswordException obj =new InvalidPasswordException ();
					throw obj;
					
				}
				catch(InvalidPasswordException e ) {
					System.out.println("invalid password entered");
				}
			}
		
		}
		
		
		
	}
}
