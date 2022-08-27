package org.ssm.arr_string;

import java.util.Scanner;

public class ReadTheArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the total number"+size);
		int arr[]=new int[size];

		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();	
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);	
		}
		sc.close();

	}

}
