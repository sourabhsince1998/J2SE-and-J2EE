package com.objectPackage;

public class PenHashcode 
{
	int num;
    public int hashCode()
   {
    	return 555;
    }
    public static void main(String[] args)
    {
    	PenHashcode p =new PenHashcode();
    	System.out.println(p.hashCode());
	}
}
