package Arrays;
//Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] my_array1 = {1789, 2035, 1899, 1456, 2013, 
		  1458, 2458, 1254, 1472, 2365, 
		  1456, 2165, 1457, 2456};
		
		System.out.println("given array is "+Arrays.toString(my_array1));
		
		Arrays.sort(my_array1);
		
		System.out.println("given array is "+Arrays.toString(my_array1));
		

		String[] my_array2 = {  "Java", "q", "ee", "qwwq","abcde", "xc" };
		  
		System.out.println("given array is "+Arrays.toString(my_array2));
		
		Arrays.sort(my_array2);	
		
		System.out.println("sorted array is "+Arrays.toString(my_array2));
		

			
				 
				  
			
		
	
	
	}

}
