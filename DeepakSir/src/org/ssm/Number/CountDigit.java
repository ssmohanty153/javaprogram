package org.ssm.Number;

import java.util.Scanner;

public class CountDigit 
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int x=count(n);
		System.out.println(x);
	}

	static int count(int n) 
	{
		int count=0,sum=0;
		
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
			count++;
		}
		
		return sum;
	}
	

}
