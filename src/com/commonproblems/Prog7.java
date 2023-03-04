package com.commonproblems;
//Write a Java program to find the number of days in a month
import java.util.Scanner;

public class Prog7 {
 
	public static void main(String[] args) 
	{
	     int month, year;
	        month = 2;
	        year = 2016;
	        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
	            System.out.println("Number of days is 29");

	        else if(month==2)
	            System.out.println("Number of days is 28");

	        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
	            System.out.println("Number of days is 31");

	        else
	            System.out.println("Number of days is 30");
	}
}

	 
		
		
		
		
		/*
		Scanner sc=new Scanner(System.in);
		
		int number_Of_DaysInMonth =0;
		String MonthOfName="";
		
		System.out.println("Input a year : ");
		int year=sc.nextInt();
		System.out.println("Input a month number :");
		int month=sc.nextInt();
		
		
		
		switch(month) {
		case 1:
			MonthOfName="January";
			number_Of_DaysInMonth =31;
			break;
			
		case 2:
			  MonthOfName = "February";
              if ((year % 4 == 0) || ((year % 100 == 0) && (year % 400== 0))) {
                  number_Of_DaysInMonth = 29;
              } else 
              {
                  number_Of_DaysInMonth = 28;
              }
              break;
          case 3:
              MonthOfName = "March";
              number_Of_DaysInMonth = 31;
              break;
          case 4:
              MonthOfName = "April";
              number_Of_DaysInMonth = 30;
              break;
          case 5:
              MonthOfName = "May";
              number_Of_DaysInMonth = 31;
              break;
          case 6:
              MonthOfName = "June";
              number_Of_DaysInMonth = 30;
              break;
          case 7:
              MonthOfName = "July";
              number_Of_DaysInMonth = 31;
              break;
          case 8:
              MonthOfName = "August";
              number_Of_DaysInMonth = 31;
              break;
          case 9:
              MonthOfName = "September";
              number_Of_DaysInMonth = 30;
              break;
          case 10:
              MonthOfName = "October";
              number_Of_DaysInMonth = 31;
              break;
          case 11:
              MonthOfName = "November";
              number_Of_DaysInMonth = 30;
              break;
          case 12:
              MonthOfName = "December";
              number_Of_DaysInMonth = 31;
      }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
}
}
*/

   
			
			
			
	
	

