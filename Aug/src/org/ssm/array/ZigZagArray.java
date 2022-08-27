package org.ssm.array;
import java.util.Scanner;
public class ZigZagArray
{
	public static void main(String[] args) 
	{
		System.out.println("Enter tye size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the second size");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i]=sc.nextInt();
		}
		int arr3[]=marge(arr,arr2);
		System.out.println("_________----------_________");
		for (int i = 0; i < arr3.length; i++) 
		{
			System.out.print(arr3[i]);
		}
	}
	static int[] marge(int[] arr1, int[] arr2)
	{
		int arr3[]=new int[arr1.length+arr2.length];
		int k=0,j=0,i=0;
		while(i<arr1.length&&j<arr2.length)
		{
			arr3[k++]=arr1[i++];
			arr3[k++]=arr2[j++];
		}
		while(i<arr1.length)
		{
			arr3[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			arr3[k++]=arr2[j++];

		}
		return arr3;
	}
}


