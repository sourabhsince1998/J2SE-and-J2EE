package com.codingNumber;
 class Countdigitprime {
    public static int check(int num)
    {
        int prime=0;
        while(num>0);
    {
    
    
        int count=0;
        int rem=num%10;
        for (int i=2;i<=rem-1;i++)
        {
            if(rem%i==0)
            {
                count++;
            }
        }
    if (count==0)
    {
        prime++;
    }
    num=num/10;

}
return prime;
}
public static void main(String[] args) {
    System.out.println(check(1234));
}
    }


