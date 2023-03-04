package Basics;
//2 Write a Java program to print 'Hello' on screen and then print your name on a separate
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name=sc.next();
		System.out.println("Hello "+name);
	}

}
