package com.codingNumber;
class Amstrong
{
    public static void test(int num){
    int res=0;
    int temp=num;
    while(num>0)
    {
        int rem=num%10;
        res=res+(rem*rem*rem);
        num=num/10;
    }
    if(temp==res)
    {
        System.out.println(temp+"is a amstrong number");
    }
    else
    {
        System.out.println(temp+"is not a amstrong number");
    }
}

public static void main(String[] args)
{
    test(153);
}
}

