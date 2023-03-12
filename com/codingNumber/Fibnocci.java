package com.codingNumber;
public class Fibnocci {
  static  void check(int end)
    {
       int n1=0;
       int n2=1;
     //  int n3=0;
       System.out.print(n1+" "+n2);
    //for(int i=3;i<=end;i++)
    for(int i=1;i<=end-2;i++)
      {
       int n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
       }
    }
    public static void main(String[] args) {
        check(10);
    }

}


