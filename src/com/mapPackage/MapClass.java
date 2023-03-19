package com.mapPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapClass 
{
	public static void main(String[] args) {
		
	LinkedHashMap<Integer,String> lhm=new LinkedHashMap();
	lhm.put(10,"Java");
	lhm.put(20, "SQL");
	lhm.put(30, "web");
	
	System.out.println(lhm.get(10));
	System.out.println(lhm);
	
	Set<Integer> s=lhm.keySet();
	for(int key:s)
	{
	System.out.println(key+" "+lhm.get(key));
	}
	System.out.println("----------------");
	HashMap<String,Integer> hm=new HashMap();
	hm.put("tom", 1);
	hm.put("Jerry", 2);
	hm.put("Dinga", 3);
	System.out.println(hm);
	
	Set<String> ss=hm.keySet();
	for(String key:ss)
	{
		System.out.println(key+" is "+hm.get(key)+" years old");
	}
	System.out.println("----------------");
	
	TreeMap<Integer,Double> t=new TreeMap<>();
	t.put(20,1.5);
	t.put(3, 22.3);
	t.put(11, 12.6);
	System.out.println(t);
	
	Set<Integer> s2=t.keySet();
	for(int key:s2)
	{
		System.out.println(key+" "+t.get(key));
	}
	
	}
}
