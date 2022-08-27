package btm.ssm.functinality;

import java.util.Scanner;

public class AccendingOrder
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size ");
	int size=sc.nextInt();
	
	int arr[];
	arr=new int[size];
	System.out.println("enter the " + size+" digit");
	for (int i = 0; i < arr.length; i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println();
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i]+",");
	}
	System.out.println();
	int arr1[];
	arr1=new int[size];
	for (int i = 0; i < arr1.length; i++) 
	{
		System.out.print(arr1[size-i-1]=arr[i]);
	}
	System.out.println("reverse array is");
	for (int i = 0; i < arr1.length; i++) 
	{
		System.out.print(arr1[i]);
	}
	sc.close();
}
}
