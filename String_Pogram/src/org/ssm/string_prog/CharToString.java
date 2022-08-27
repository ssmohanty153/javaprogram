package org.ssm.string_prog;

import java.util.Scanner;

public class CharToString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		sc.close();
		String lo=lowerCase(str);
		System.out.println(lo);

	}

	static String lowerCase(String str) 
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
			}

		}
		String s=new String(ch);
		return s;


	}
}
