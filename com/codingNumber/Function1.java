package com.codingNumber;
class Function1
{
    static int test()
    {
        System.out.println("running test() function");
        return 25;
    }

public static void main(String[] args)
{
System.out.println("main method started");
test();
int x= test();
System.out.println("x values is "+x);
System.out.println("main method ended");
}

}
