package org.ssm.arr_string;

import java.util.Scanner;

public class SumOfAllArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		System.out.println("enter the "+ size+" element");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		sc.close();

	}
}
