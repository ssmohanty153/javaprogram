package org.ssm.string;

import java.util.Scanner;

public class Panagram 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		boolean st=reverseStri(str);
		if(st)
		{
			System.out.println(str+" is panagram");
		}
	}


	private static boolean reverseStri(String str) 
	{
		if(str.length()<26)
			return false;

		int c[]=countOccurance(str);
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==0)
				return false;

		}
		return true;
	}


	private static int[] countOccurance(String str) 
	{
		int ch[]=new int[26];
		for (int i = 0; i < str.length(); i++) 
		{
			char c=str.charAt(i);
			if(c>=65&&c<=90)
			{
				ch[c-65]++;
			}
			else if(c>=97&&c<=122)
			{
				ch[c-97]++;
			}
		}

		return ch;
	}
}
