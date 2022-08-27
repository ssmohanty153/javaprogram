package org.ssm.string_prog;

import java.util.Scanner;

public class SumDigitInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.next();
		sc.close();
		int sum=0;
		//use this//
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			
			if(ch[i]>='0'&&ch[i]<='9')
			{
				sum=sum+ch[i]-48;
			}

		}
		//or this//
		/*
		for (int i = 0; i < str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				sum=sum+ch-48;
			}

		}
		*/
		System.out.println(sum);


	}
}
