package com.ssm.doubleleLink;
import java.util.NoSuchElementException;
import javax.rmi.CORBA.Tie;
public class DoubleLinkedList 
{
	Node head;
	Node tail;
	int length;
	public DoubleLinkedList()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public boolean isempty()
	{
		return length==0;
	}
	public int lenght()
	{
		return length;
	}
	public void displayForword()
	{
		if(head==null)
		{
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public void displayBackword()
	{
		if(tail==null)
		{
			return;
		}
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+" -->");
			temp=temp.previous;
		}
		System.out.print("null");
	}
	public void insertFirst(int value)
	{
		Node newNode=new Node(value);
		if(isempty())
		{
			tail=newNode;
		}
		else
		{
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	public void insertLast(int value)
	{
		Node newNode=new Node(value);
		if(isempty())
		{
			head=newNode;
		}
		else
		{
			newNode.previous=tail;
			tail.next=newNode;
		}
		length++;
		tail=newNode;
	}
	public Node deleteFirst()
	{
		if(isempty())
		{
			throw new NoSuchElementException();
		}
		Node temp=head;
		if(head==tail)
		{
			tail=null;
		}
		else  
		{
			head.next.previous=null;
		}
		head=head.next;
		temp.next=null;
		return temp;
	}
	public Node deleteLast()
	{
		if(isempty())
		{
			throw new NoSuchElementException();
		}
		Node temp=tail;
		if(tail==head)
		{
			head=null;
		}
		else
		{
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		return temp;
	}
}
