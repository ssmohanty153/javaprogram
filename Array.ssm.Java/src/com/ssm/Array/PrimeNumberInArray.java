package com.ssm.Array;

import java.util.Scanner;

public class PrimeNumberInArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+"integer");
		int count=0;
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		for (int i = 0; i < ar.length; i++)
		{
			boolean k=isPrime(ar[i]);
			
			
				if(k)
				{
					System.out.println(+ar[i]+"is Prime"+ar[i]);
				}
				else
					System.out.println(+ar[i]+"is not  Prime");
		}
					
			/*if(isPrime(ar[i]))
			{
				count++;
			System.out.println(i+"---->"+ar[i]);
			}
		
		System.out.println("total no of prime no is "+count);
		//System.out.println(i+"---->"+ar[i]);
		*/
	}
	static boolean isPrime(int n)
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
