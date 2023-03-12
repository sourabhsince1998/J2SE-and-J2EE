package com.codingNumber;
class Reverse2 {

    public static void test(int num)
{
int rev=0;
int i=num;
while(i>0)
{
    rev=rev*10+i%10;
    i=i/10;
}
System.out.println(rev);
}
public static void main(String[] args)
{
    test(123);
}
}
    

