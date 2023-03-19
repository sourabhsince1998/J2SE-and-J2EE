package com.jsp.Collection;

import java.util.Comparator;

public class sortCost implements Comparator<Car>
{
	public int compare(Car x,Car y)
	{
		//return x.name.compareTo(y.name);
		return x.cost-y.cost;
		
	}

}
