package com.codingNumber;
 class Spyno 
 {
    public static void test(int num)
    {
    
for(int i=1;i<=num;i++)
{

    int sum=0;
    int prod=1;
    int n=i;
    while (n>0)
{
    int rem=n%10;
    sum=rem+sum;
    prod=rem*prod;
    n=n/10;
}

if(sum==prod)
{
    System.out.println(i+"");
}

}
}
 public static void main(String[] args)
 {
    test(15);
 }
}