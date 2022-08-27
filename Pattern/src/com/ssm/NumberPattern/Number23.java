package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number23
{
		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the odd   number");
		int n=sc.nextInt();
		int sp=0,ele=n,q=n/2+1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			
			int k=q;
			
			for(int j=1;j<=ele;j++)
			{
				System.out.print(k);
				if(j<=ele/2)
				k--;
			else 
				k++;
			}
			
			if(i<=n/2)
			{
				ele=ele-2;
				sp++;
				q=n/2+1-i;
			}
			else
			{
				sp--;
				ele=ele+2;
				q=i-n/2+1;
			}
			System.out.println();
			

		}
		}
		
	}


	


