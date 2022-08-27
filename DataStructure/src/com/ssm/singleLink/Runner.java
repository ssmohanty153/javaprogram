package com.ssm.singleLink;

public class Runner 
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(15);
		list.insert(12);
		list.insertAtStart(144);
		list.insertAt(2, 100);
		list.show();
		
	}

}
