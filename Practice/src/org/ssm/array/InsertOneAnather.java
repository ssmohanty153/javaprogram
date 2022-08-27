package org.ssm.array;

import java.util.Scanner;

public class InsertOneAnather 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the first element");
		int arr1[]=read();
		System.out.println("Enter the second element");
		int arr2[]=read();
		System.out.println("write array1");
		write(arr1);
		System.out.println("write array2");
		write(arr2);
		int index=3;
		int array3[]=zigzag(arr1,arr2,index);
		for (int j = 0; j < array3.length; j++) 
		{
			System.out.print(array3[j]+",");
		}
	}
	static int[] zigzag(int[] arr1, int[] arr2,int index)
	{
		int arr3[]=new int[arr1.length+arr2.length];

		for (int i = 0; i < arr1.length; i++) 
		{
			if(i<index)
				arr3[i]=arr1[i];
			else
				arr3[arr2.length+i]=arr1[i];


		}
		for (int i = 0; i < arr2.length; i++) 
		{
			arr3[index+i]=arr2[i];

		}
		return arr3;
	}
	static void write(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}
	static int[] read() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}

