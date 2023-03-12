package com.codingNumber;
public class Reverse {
  
 public static void main(String[] args) {
  
  int num=0,rem;
  int rev=0;
 
  System.out.println("1234");
  while(num>0)
  {
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
  }
  System.out.println("reverse number is"+rev);
}  
    }
