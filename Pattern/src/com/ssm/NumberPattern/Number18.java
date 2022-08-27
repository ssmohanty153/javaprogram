package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number18
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int start=1;
	for(int i=1;i<=n;i++)
	{
		int k=start;
		for(int j=1;j<=i;j++)
		{
			System.out.print(k);
			if(i%2==1)
				k--;
			else
			k++;
		}
		if(i%2==1)
			start++;
		else
			start=start+2*i;
		System.out.println();
	}
}
}
