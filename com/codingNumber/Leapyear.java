package com.codingNumber;
class Leapyear
{
public static String check (int year)
{
if(year%400==0 || (year%4==0 && year%100!=0))	
{
	return"leap year";
}
else
{
	return "not a leap year";
}
}
public static void main(String[]args)
{
	System.out.println(check (2007));
}
}