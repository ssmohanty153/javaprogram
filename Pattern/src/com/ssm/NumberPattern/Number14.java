package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number14 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
	int ele=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
		    }
			int k=1;
			for(int j=1;j<=ele;j++)
			{
			System.out.print(k);
			if(j<=ele/2)
				k++;
			else
				k--;
			}
			ele=ele+2;
			System.out.println();
			}
	
		}
	}

