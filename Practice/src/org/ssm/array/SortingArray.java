package org.ssm.array;
import java.util.Arrays;
import java.util.Scanner;
public class SortingArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the array");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the "+size+" number");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();	
		}
		sc.close();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);
		}



	}
}
