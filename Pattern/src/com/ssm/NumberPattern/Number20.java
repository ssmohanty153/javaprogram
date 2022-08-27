package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number20 {
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int half=0,q=1;
		if(n%2==1)
		{
		half=n/2+1;
		}
		else
			half=n/2;
		
		for(int i=1;i<=n;i++)
		{
			int k=q;
			for(int j=1;j<=n;j++)
			{
				
				System.out.print(k+" ");
				k++;
			}
			if(i<half)
				q=q+2*n;
			if(i==half)
			{
				if(n%2==1)
					q=q-n;
				else
					q=q+n;
			}
			if(i>half)
				q=q-n*2;
		System.out.println();
		}
		
	}

}
