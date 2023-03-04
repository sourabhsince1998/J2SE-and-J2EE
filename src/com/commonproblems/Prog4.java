package com.commonproblems;
//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or 
//"large" if it exceeds 1,000,000.
public class Prog4 
{
	public static void main(String[] args) {
		
		int input=25;
         
		if (input > 0)
        {
            if (input < 1)
            {
                System.out.println(input+" Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println(input+" Positive large number");
            }
            else
            {
                System.out.println(input+" Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println(input+" Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println(input+" Negative large number");
            }
            else {
            
                System.out.println(input+" Negative number");
            }
        }
        else
        
            System.out.println("Zero");
        
    }

}
