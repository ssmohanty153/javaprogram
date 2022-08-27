package org.ssm.array;
import java.util.Scanner;
public class ReverseString 
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
		for (int i = 0; i < arr.length/2; i++) 
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		System.out.println("[");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+",");
			
		}
		System.out.println("]");



	}
}
