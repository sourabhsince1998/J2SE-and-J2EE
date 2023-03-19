package com.stackQ;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQ 
{
	public static void main(String[] args)
	{
		Queue q=new PriorityQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.poll());
		q.clear();
		System.out.println(q.isEmpty());
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.poll());
		
		
	}

}
