package org.ssm.Number;

import java.util.Scanner;

public class EvenNumberAve 
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double x=average(n);
		System.out.println(x);
	}

	static double average(int n) 
	{
		double count=0;
		double sum=0;
		for (int i = 2; i <=n; i++) 
		{
			if(i%2==0)
			{
				sum=sum+i;

				count++;
			}


		}
		double no=sum/count;

		return no;
	}
}

