package org.ssm.Number;
import java.util.Scanner;
public class AmstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbner");
		int n=sc.nextInt();
		sc.close();
		boolean x=isarmStrongNumber(n);
		if(x)
		{
			System.out.println(n+" is armStrong number");
		}
		else 
		{
			System.out.println(n+" is not armStrong number");
		}
	}
	
	private static boolean isarmStrongNumber(int n) 
	{
		int sum=0,t=n;
		while(n!=0)
		{
			int x=n%10;
			sum=sum+power(x,digit(t));
			n=n/10;
		}
		return sum==t;
	}
	private static int digit(int n) 
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	
	private static int power(int n,int q) 
	{
		int sum=1;
		while(q>0)
		{
			sum=sum*n;
			q--;
		}
		return sum;
	}
}
