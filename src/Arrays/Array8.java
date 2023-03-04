package Arrays;

import java.util.Scanner;
//Write a Java program to find the maximum and minimum value of an array.
public class Array8 {

	public static void main(String[] args) 
	{
	       int a[]= {10, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   	
	   int max = 0;
	   for(int i=0;i<a.length;i++)
		   if(max<a[i])
			   max=a[i];
	   System.out.println("maximum value is "+max);
	   
	   int min =a[0];
	   for(int i=0;i<a.length;i++)
		   if(min>a[i])
			   min=a[i];
	   System.out.println("minimum value is "+min);
	       
	  }
	
	

	}


