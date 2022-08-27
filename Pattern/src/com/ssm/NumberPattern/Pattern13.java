package com.ssm.NumberPattern;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(i+1);
			for(int j=1;j<=n;j++)
			{
		System.out.print(i);	
			}
			if(i%2==1)
				System.out.print(i+1);
			System.out.println();
		}
	}
}
