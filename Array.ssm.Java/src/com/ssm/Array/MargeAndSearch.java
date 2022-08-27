package com.ssm.Array;
import java.util.Scanner;
public class MargeAndSearch 
{
	public static void main(String[] args)
	{
		System.out.println("enter the first array :");
		int arr1[]=input();
		System.out.println("enter the second array :");
		int arr2[]=input();
		System.out.println("value of first arry");
		displayArr(arr1);
		System.out.println("value of first arry");
		displayArr(arr2);
		System.out.println("marge the element");

		int marge[]=marge(arr1,arr2);

		for (int i = 0; i < marge.length; i++) 
		{
			System.out.print(marge[i]+",");
		}
		System.out.println();
		System.out.println("enter the search element");
		int count=0;
		Scanner sc =new Scanner(System.in);
		int ser=sc.nextInt();
		for (int i = 0; i < marge.length; i++)
		{
			if(marge[i]==ser)
			{
				count++;
			}
		}
		System.out.println(ser+"in the string  is :"+count);
		sc.close();
		sc.close();
	}
	static int[] input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the "+size+" value");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	static void displayArr(int arr[])
	{

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}

	static int[] marge(int a[],int b[])
	{
		int mar[]=new int[a.length+b.length];
		for (int i = 0; i < a.length||i<b.length; i++)
		{
			if(i<a.length)
			{
				mar[i]=a[i];
			}
			if(i<b.length)
			{
				mar[a.length+i]=b[i];
			}
		}
		return mar;
	}
}
