package Basics;
//7.Write a program to assign a value of 100.235 to a double variable and 
//then convert it to int.
public class DoubletoInt {

	public static void main(String[] args) 
	{
		double b=100.235;
		int i=(int)100.235;
		
		System.out.println("100.235 is casted to int "+i);//narrowing
		
		double a=(double)100;
		System.out.println("100 is casted to double  "+a);  //widening
	
	}

}
