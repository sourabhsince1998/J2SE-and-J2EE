package com.codingNumber;
public class Removekey {
   static int check(int n,int key)
    {
        
        System.out.println("initial value is "+n);
        int res1=0,res=0;
        while (n>0)
        {
            int rem=n%10;
            if(rem!=key)
            {
                res1=res1*10+rem;
            }
            
            n=n/10;

        }
        System.out.println("after removing key "+res1);
        while (res1>0)  
        {
            int rem=res1%10;
            res=res*10+rem;
            res1=res1/10;
            
        }
        return res;
        //System.out.println("final value is"+res);
    }

    public static void main(String[] args) {
        System.out.println(check(10022,0));
    }
    
}
