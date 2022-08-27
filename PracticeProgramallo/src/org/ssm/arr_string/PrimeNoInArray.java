package org.ssm.arr_string;

import java.util.Scanner;

public class PrimeNoInArray 
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
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{

			boolean n=isPrimeNo(arr[i]);
			if(n)
			{
				count++;
				System.out.print(arr[i]+ " , ");
			}
			
		}
		System.out.println();
		System.out.println("Total no of prime no is "+count);

	}

	private static boolean isPrimeNo(int n) 
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			i++;
		}

		return true;
	}

}
