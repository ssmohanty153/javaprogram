package org.ssm.Number;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbner");
		int n=sc.nextInt();
		sc.close();
		boolean x=isprimeNumber(n);
		if(x)
		{
			System.out.println(n+" is prime number");
		}
		else 
		{
			System.out.println(n+" is not prime number");
		}

	}

	private static boolean isprimeNumber(int n)
	{
		
		int j=2;
		while(j<=n/2)
		{
		if(n%j==0)
		
			return false;
			
				
		
		j++;
		}
		
		return true;
	}
}
