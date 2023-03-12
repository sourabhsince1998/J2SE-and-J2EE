package com.codingNumber;
class Primenumber
{
public static void test(int num)
 {  
int count=0;
for(int i=2;i<=num-1;i++)
{
    if(num%i==0)
   {
    count++;
 }

}
System.out.println(count);
if(count==0)
{
    System.out.println(num+"prime number");
}
else 
{
    System.out.println(num+"not a prime number"); 
}
}
 public static void main(String[] args) {
    test(5);
 }   
 }
















