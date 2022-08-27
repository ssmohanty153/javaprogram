package org.ssm.string_prog;

import java.util.Scanner;

public class SumOfNumberINSTring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		sc.close();
		int sum=0;
		char ch[] =str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			int no=0;
			while(i<ch.length&&ch[i]>='0'&&ch[i]<='9')
			{
				no=no*10+ch[i]-48;
				i++;
			}
			sum=sum+no;
		}
		System.out.println("sum of the number is  "+sum);

	}
}
