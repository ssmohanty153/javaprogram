package org.ssm.Number;

import java.util.Scanner;

public class StrongNumber 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbner");
	int n=sc.nextInt();
	sc.close();
	boolean x=isStrongNumber(n);
	if(x)
	{
		System.out.println(n+" is Strong number");
	}
	else 
	{
		System.out.println(n+" is not Strong number");
	}

}
private static boolean isStrongNumber(int n) 
{
	int sum=0,t=n;
	while(n!=0)
	{
	int x=n%10;
	sum=sum+fact(x);
	 n=n/10;
	 }

	return sum==t;
}
private static int fact(int x) 
{
	int fact=1;
	while(x>0)
	{
		fact=fact*x;
		x--;
	}
	return fact;
}

}