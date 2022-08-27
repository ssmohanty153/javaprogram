package org.ssm.arr_string;

import java.util.Scanner;

public class Smallest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the "+size +" element");
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
		}
		System.out.println(" smallest is "+smallest );
		sc.close();
	}

}
