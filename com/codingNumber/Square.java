package com.codingNumber;
 class Square
 {
static int square(int n)
{
 return n*n;
}
public static void main(String[] args)
{
    System.out.println("main method started");
    int a=5;
    int b=4;
    int result=square(a)+2*a*b+square(b);
    System.out.println("result is "+result);
    System.out.println("main method ended");

}
 }



















