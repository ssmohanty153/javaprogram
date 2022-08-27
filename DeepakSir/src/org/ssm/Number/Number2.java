package org.ssm.Number;

import java.util.Scanner;

public class Number2 
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
	int a=0,b=1,c=2;
	for (int i = 0; i < n; i++) 
	{
		System.out.print(a);
		
	
	int sum=a+b+c;
	a=b;
	b=c;
	c=sum;
	}
	
	}
}
