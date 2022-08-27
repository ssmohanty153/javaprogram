package org.ssm.array;
import java.util.Scanner;
public class Laege 
{public static void main(String[] args) 
{
	System.out.println("Enter tye size");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr1[]=new int[size];
	for (int i = 0; i < arr1.length; i++) 
	{
		arr1[i]=sc.nextInt();
	}
	int big=arr1[0];
	for (int i = 0; i < arr1.length; i++)
	{
		if(arr1[i]>big)
			big=arr1[i];
	}
	System.out.println(big);
}
}
