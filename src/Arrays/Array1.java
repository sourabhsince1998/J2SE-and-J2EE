package Arrays;
//find the arrays length and array instailtion 
public class Array1 {
	public static void main(String[] args) {
		
	
	
	String[] names= {"Dinga","Dingi","John","Kalim"};
	
	
	System.out.println("The size of the array is: "+names.length);


	int[] num=new int[4];
	System.out.println(num[0]);
	System.out.println(num[2]);
	System.out.println(num[3]);
	
	num[0]=20;
	num[1]=30;
	num[2]=40;
	num[3]=50;
	
	System.out.println(num[0]);
	System.out.println(num[2]);
	System.out.println(num[3]);
	
	try
	{
		System.out.println(num[4]);
	}
	catch (Exception e) {
		System.out.println("check in given array length");
	}

	
	
	
	}
}
