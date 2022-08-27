package org.ssm.Number;

import java.util.Scanner;

public class Divisible3And5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int p=sc.nextInt();
		int x=count(p);
		System.out.println(x);
		
	}
	static int count(int p)
	{
		
		int count=0;
		for (int i = 1; i <= p ; i++) 
		{
			if(i%3==0&&i%5==0)
			{
				count++;
			}
			
		}
		return count;
	}
	
}

