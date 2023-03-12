package com.codingNumber;
//RECURSION

public class Natural {
    public static void num(int n)
    {
        if(n<=5)
        {
            System.out.print(n+" ");
            num(n+1);
        }
    }
    public static void main(String[] args) {
        num(1);
    }
}
