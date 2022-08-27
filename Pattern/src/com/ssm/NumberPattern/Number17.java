package com.ssm.NumberPattern;

import java.util.Scanner;

public class Number17 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sp=n/2,a=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			int k=a/2+1;
			for(int j=1;j<=a;j++)
			{
				System.out.print(k);
				if(j<=a/2)
					k--;
				else 
					k++;
			}
			if(i<=n/2)
			{
				
				sp--;
				a=a+2;
			}
			else{
				sp++;
				a=a-2;
			}
			System.out.println();
		}
}

}
