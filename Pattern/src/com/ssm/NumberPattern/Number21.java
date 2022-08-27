package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number21 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int k=1,sp=0,ele=n*2,q=n*n+1;
	for(int i=1;i<=n;i++)
	{
		
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=ele;j++)
		{
			if(j<=ele/2)
			{
			System.out.print(k);
			k++;
			}
			else
			{
				System.out.print(q);
				q++;
			}
			if(j<ele)
			
				System.out.print("*");
			
			
		}
		q=q-ele+1;
		ele=ele-2;
		sp=sp+2;
		System.out.println();
		
	}
	}

}
