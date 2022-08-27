package com.ssm.doubleleLink;

public class Run 
{
	public static void main(String[] args) 
	{
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.insertLast(10);
		dll.insertLast(110);
		dll.insertLast(101);
		dll.insertLast(1120);
		dll.insertLast(1);
		dll.insertLast(130);
		dll.insertLast(140);
		dll.displayForword();
		//dll.displayBackword();
		dll.deleteFirst();
		dll.deleteLast();
		dll.displayForword();
		
		
		
	} 
	

}
