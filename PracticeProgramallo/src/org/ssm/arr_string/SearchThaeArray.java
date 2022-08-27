package org.ssm.arr_string;

import java.util.Scanner;

public class SearchThaeArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the "+size +" element");
		int arr[]=new int[size];
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search element ");
		int search=sc.nextInt();
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==search)
				count++;
		}
		System.out.println(count);
		sc.close();
	}

}
