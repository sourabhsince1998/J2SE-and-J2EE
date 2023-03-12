package com.codingNumber;

public class Even {
    public static void main(String[] args) {
        int n=20;
        int lp=0;
        for(int i=2;i<=n;i=i+4)
        {
            System.out.println(i+" "+(i+2)+" "); //optimizing or reducing countings
            lp++;                               
        }
        System.out.println();
         System.out.println("count="+lp);
    }
}
