package org.ssm.arr_string;
import java.util.Scanner;
public class Zigzag 
{
	public static void main(String[] args) 
	{
		int arr1[]=readThearr();	
		int arr2[]=readThearr();
		int arr3[]=zigzag(arr1,arr2);
		for (int i = 0; i < arr3.length; i++) 
		{
			System.out.print(arr3[i]+" ,");
		}
	}
	private static int[] zigzag(int[] arr1, int[] arr2) 
	{
		int arr3[]=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length&&j<arr2.length)
		{
			arr3[k++]=arr1[i++];
			arr3[k++]=arr2[j++];
			while(i<arr1.length)
			{
				arr3[k++]=arr1[i++];
			}
			while(j<arr2.length)
			{
				arr3[k++]=arr2[j++];
			}
		}
		return arr3;
	}
	private static int[] readThearr() 
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
		return arr;
	}
}
