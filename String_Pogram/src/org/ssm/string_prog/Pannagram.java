package org.ssm.string_prog;
import java.util.Scanner;
public class Pannagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		sc.close();

		boolean rs=isPanagram(str);
		if(rs)
		{
			System.out.println(" is pannagram");
		}
		else
		{
			System.out.println(" is not pannagram");
		}

	}

	static boolean isPanagram(String str) 
	{
		if(str.length()<26)
		{
			return false;
		}
		int c[]=countOccurance(str);
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==0)
			{
				return false;
			}
		}
		return true;
	}
	static int[] countOccurance(String str) 
	{
		int c[]=new int[26];
		for (int i = 0; i <str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90)
			{
				c[ch-65]++;
			}
			else 
				if(ch>=97&&ch<=122)
				{
					c[ch-97]++;
				}
		}
		return c;
	}
}
