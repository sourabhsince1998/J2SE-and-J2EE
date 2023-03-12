package com.codingNumber;
 class Factorial {

    public static void test(int num)
{
int fact=1;
int i=num;
while(i>0)
{
    fact=fact*i;
    i--;
}
System.out.println(fact);
}
public static void main(String[] args)
{
    test(5);
}
}
