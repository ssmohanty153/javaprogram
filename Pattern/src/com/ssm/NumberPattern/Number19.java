package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number19 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(k);
				if(i%2==1)
					k++;
				else
				k--; 
			}
			if(i%2==1)
				k=k+n-1;
			else
				k=k+n+1;
			System.out.println();
		}
	}
	}


