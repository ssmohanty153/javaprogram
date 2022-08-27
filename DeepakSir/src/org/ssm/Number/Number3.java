package org.ssm.Number;

import java.util.Scanner;

public class Number3
{
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbner");
		int n=sc.nextInt();
		sc.close();
		numberseries(n);
	}

	static void  numberseries(int n)
	{
		int c=2;
		for (int i = 0; i < n; i++) 
		{
			

			if(c%4==0)
			{
				System.out.print(-c+",");
			}
			else
				System.out.print(c+",");
			
			c=c+2;
		}


		System.out.println();
	} 
}

