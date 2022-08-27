package org.ssm.Number;

import java.util.Scanner;

public class Number4 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbner");
		int n=sc.nextInt();
		sc.close();
		numberseries(n);
	}

	static void  numberseries(int n)
	{
		int j=0;
		for (int i = 0; i <= n; i++) 
		{
		 j=j*10+i+1;
		System.out.print(j+",");
		}
		
		
		
	}
}


