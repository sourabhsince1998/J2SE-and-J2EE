package com.codingNumber;
import java.util.Scanner;
public  class Countkeydigit
 {
   static int check(int end ,int key)
    {
      int count=0;
      for (int i=1;i<=end;i++)
      {
        if(i%10==key && i/10==key)
        {
            count=count+2;
        }
        else if(i%10==key)
        {
            count++;
        }
        else if(i/10==key)
        {
            count++;
        }
        else
        {
            continue;
        }
      }
      return count;
    }
    public static void main(String[] args) {
     //   Countkeydigit c1=new Countkeydigit();
      //  System.out.println(c1.check(24,2));
      Scanner sc=new Scanner(System.in);
      System.out.println("enter end number");
      int end=sc.nextInt();
      System.out.println("enter key digit");
      int key=sc.nextInt();
      System.out.println(check(end,key))
      ;
    }
}
