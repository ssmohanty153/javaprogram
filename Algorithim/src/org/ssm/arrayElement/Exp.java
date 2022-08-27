package org.ssm.arrayElement;
import java.util.Scanner;
public class Exp 
{
	class Node
	{  
		int[] data=new int[5];  
		Node previous;  
		Node next;
		int i=0;  

		public void add(int data)
		{ 
			if(i<5)
			{ 
				this.data[i++] = data;  
			}  
		}
	}

	Node head, tail = null; 
	Node newNode=null;
	int nodeCount=0; 

	public void addNode(int data)
	{  
		if(newNode!=null&& newNode.i<5)
		{
			newNode.add(data);
		}
		else
		{
			newNode = new Node();
			nodeCount++;
			if(head == null)
			{  
				head = tail = newNode;
				//according to question we use next and previous node take null;
				head.previous = null;  
				tail.next = null;  
			}  
			else
			{  
				tail.next = newNode;  
				newNode.previous = tail;  
				tail = newNode;  
				tail.next = null;  
			}
			newNode.add(data);  
		} 
	} 
	public void findMinMaxN0(int no)
	{
		Node current;
		if(no>nodeCount||no<1)
		{
			System.out.println("node is not present");
			return;
		}
		if(no==1)
		{
			current=head;
		}
		else
		{
			current=head;
			for (int i = 2; i <no; i++) 
			{
				current=current.next;

			}

		}
		int minValue=current.data[0];
		for(int i1=1;i1<current.i;i1++)
		{
			if(current.data[i1]<minValue)
			{
				minValue=current.data[i1];
			}
		}
		System.out.println("min value is:-"+minValue);
		int maxValue=current.data[0];
		for(int i1=1;i1<current.i;i1++)
		{
			if(current.data[i1]>maxValue)
			{
				maxValue=current.data[i1];
			}
		}
		System.out.println("maxvalue :-"+maxValue);
	}

	public void sortingNodes(int no)
	{  
		Node current;
		if(no>nodeCount||no<1)
		{
			System.out.println("node is not present");
			return;
		}
		if(no==1)
		{
			current=head;
			System.out.println("This node does no have previous node");
			Node next=current.next;
			for (int j = 0; j < next.i; j++) 
			{
				for(int k=j+1;k<next.i;k++)

				{
					if(next.data[j]<next.data[k])
					{
						int temp=next.data[j];
						next.data[j]=next.data[k];
						next.data[k]=temp;
					}
				}

			}
			System.out.println("next node");

			for(int j=0;j<next.i;j++)
			{
				System.out.print(next.data[j]+" ");
			}
		}

		else if(nodeCount==no)
		{
			current=tail;
			System.out.println("this node does no have next node");
			Node prev=current.previous;
			for (int j = 0; j < prev.i; j++) 
			{
				for(int k=j+1;k<prev.i;k++)

				{
					if(prev.data[j]<prev.data[k])
					{
						int temp=prev.data[j];
						prev.data[j]=prev.data[k];
						prev.data[k]=temp;
					}
				}

			}
			System.out.println("previous node is :_");
			for (int j = 0; j < prev.i; j++) 
			{
				System.out.print(prev.data[j]+" ");

			}
		}
		else{
			current=head;
			for(int j=2;j<=no;j++)
			{
				current=current.next;

			}
			Node prev=current.previous;
			Node next=current.next;
			for(int j=0;j<prev.i;j++)
			{
				for(int k=j+1;k<prev.i;k++)
				{
					if(prev.data[j]>prev.data[k])
					{
						int temp=prev.data[j];
						prev.data[j]=prev.data[k];
						prev.data[k]=temp;
					}
				}
			}
			System.out.println("prev node: ");
			for (int j = 0; j < prev.i; j++) 
			{
				System.out.print(prev.data[j]+" ");

			}
			System.out.println();
			for (int j = 0; j < next.i; j++) 
			{
				for(int k=j+1;k<next.i;k++)

				{
					if(next.data[j]<next.data[k])
					{
						int temp=next.data[j];
						next.data[j]=next.data[k];
						next.data[k]=temp;
					}
				}

			}
			System.out.println("next node");

			for(int j=0;j<next.i;j++)
			{
				System.out.print(next.data[j]+" ");
			}
		}
	}


	public void display()
	{  
		Node current = head;  
		if(head == null)
		{  
			System.out.println("List is empty");  
			return;  
		}  
		while(current != null)
		{  

			System.out.print(current.data + " ");  
			current = current.next;  
		}  
		System.out.println();  
	}  

public static void main(String[] args)
{
	Exp dList=new Exp();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size what you want to store");
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++)
	{
		arr[i]=sc.nextInt();

	}
	for (int i = 0; i < arr.length; i++)
	{
		dList.addNode(arr[i]);
	}
	System.out.println("Find min max  number");
	int no=sc.nextInt();
	dList.findMinMaxN0(no);
	
	System.out.println("Find sorting nodes");
	int no1=sc.nextInt();
	dList.sortingNodes(no1);
}
}
