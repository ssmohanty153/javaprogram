package com.ssm.Array;
import java.util.Scanner;
public class ZigZagOrder
{
	public static void main(String[] args) 
	{
		System.out.println("Enter t6he first array size :");
		int arr1[]=readArray();
		System.out.println("Enter the second array size :");
		int arr2[]=readArray();
		System.out.println("write the array1");
		write(arr1);
		System.out.println("write the array2");
		write(arr2);
		System.out.println("after the zig zag order");
		System.out.println();
		int array3[]=zigzag(arr1,arr2);
		for (int j = 0; j < array3.length; j++) 
		{
			System.out.print(array3[j]+",");
		}
	}
	static int[] readArray() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		return arr;
		
		
	}
	static void write(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+",");

		}
		System.out.println();
	}

	static int[] zigzag(int a1[],int a2[])
	{
		int a3[]=new int[a1.length+a2.length];
		int i=0,j=0,k=0;
		while(i<a1.length&&j<a2.length)
		{
			a3[k++]=a1[i++];
			a3[k++]=a2[j++];
		}
		while(i<a1.length)
		{
			a3[k++]=a1[i++];	
		}
		while(j<a2.length)
		{
			a3[k++]=a2[j++];	
		}
		return a3;
	}
}
