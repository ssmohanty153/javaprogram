package org.ssm.Number;

import java.util.Scanner;

public class PrimeNumberBetwTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sc.close();
		prime(n1,n2);

	}
	static void prime(int n1,int n2)
	{
		if(n1>n2)
		{
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
			
		}
		while(n1<=n2)
		{
			if(isPrime(n1))
			{
				System.out.println(n1+" ");
			}
			n1++;
		}

	}
	private static boolean isPrime(int n1) 
	{
		int j=2;
		while(j<=n1/2)
		{
			if(n1%j==0)
				return false;
			j++;
		}
		return true;
	}


}






