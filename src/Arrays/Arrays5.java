package Arrays;

public class Arrays5 {
	//Write a Java program to test if an array contains a certain value
	
	
	
	public static void main(String[] args) {

		int[] my_array1 = {1789, 2035, 1899, 1456, 2013, 
		  1458, 2458, 1254, 1472, 2365, 
		  1456, 2165, 1457, 2456};
		
		/*int toFind=1472;
		boolean found=false;
		
		for(int n:my_array1)
			if(n==toFind) {
				found=true;
				break;
			}
		
if(found) 
	System.out.println(toFind+" is found");

else
	System.out.println(toFind+" is not found");*/
		
		
		int toFind=1472;
		//int i=0;
		for(int i=0;i<my_array1.length;i++)
		
		{
			if(my_array1[i]==toFind)
				System.out.println("given number is in array "+toFind);
			     
			else
				System.out.println("given no is not in array");
			
		}
		
		}
}