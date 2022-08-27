package com.ssm.singleLinkAca;

public class EmployeeLInkedList 
{
	private EmployeeNode head;
	private int size;

	public void addtoFront(Employee employee)

	{
		EmployeeNode node=new EmployeeNode(employee);
		node.setNext(head);
		head=node;
		size++;


	}
	public  EmployeeNode removeFromFront()
	{
		if(isEmpty())
		{
			return null;
		}
		EmployeeNode removeNode=head;
		head=head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;

	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public int getSize()
	{
		return size;
	}
	public void printList()
	{
		EmployeeNode current=head;
		System.out.print("head==>");

		while(current!=null)
		{
			System.out.print(current);
			System.out.print("-->");
			current=current.getNext();


		}
		System.out.println("null");
	}
}
