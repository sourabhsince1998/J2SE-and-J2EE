package com.setPackage;

import java.util.TreeSet;

public class CarComparable implements Comparable<CarComparable>
{
	int cost;
	String name;
	
	public CarComparable(int cost, String name) 
	{
		super();
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "CarComparable [cost=" + cost + ", name=" + name + "]";
	}
    
	@Override
	public int compareTo(CarComparable cx)
	{
		return this.cost-cx.cost;
	}
	
}
