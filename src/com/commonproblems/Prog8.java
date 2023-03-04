package com.commonproblems;
//Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
//print an error message.
public class Prog8 {

	public static void main(String[] args) {
	
		  char ch = '5';

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch== 'A' ||ch== 'E'|| ch== 'I' ||ch== 'O' || ch== 'U')
	        {
	        	System.out.println(ch + " is vowel");
	        }
	        else if((ch>='a' && ch<='z')||(ch>='A' && ch>='Z')){
	            System.out.println(ch + " is consonant");
	        }
	       else {
	        	System.err.println("Error");
	       }

	    }
	}

	
	

