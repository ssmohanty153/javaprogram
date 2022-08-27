/*enter the Size of the array
4
52
41
41
56
41--->2
52--->1
56--->1
 */
package com.ssm.Array;
import java.util.Scanner;
public class BitSetMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the "+size+" integer");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		int big=arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]>big)
			{
				big=arr[i];  
			}
		}
		int count[]=new int[big+1];
		for (int j = 0; j < arr.length; j++) 
		{
			count[arr[j]]++;
		}
		
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]!=0)
			{
				System.out.println(i+"--->"+count[i]);
			}
		}
	}
}
