package com.setPackage;

import java.util.TreeSet;

public class CarMain 
{
	public static void main(String[] args) 
	{
		CarComparable c1=new CarComparable(100,"Benz");
		CarComparable c2=new CarComparable(200,"Audi");
		CarComparable c3=new CarComparable(300,"BMW");
		
	
	TreeSet<CarComparable> t=new TreeSet<CarComparable>();
	t.add(c1);
	t.add(c2);
	t.add(c3);
	
	for (CarComparable c:t)
	{
		System.out.println(c);
	}
	
	}
}


