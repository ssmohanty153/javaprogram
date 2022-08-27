package org.ssm.string;

import java.util.Scanner;

public class SmallestAndBiggest
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		String st=smallest(str);
		System.out.println(st);

	}

	static String smallest(String str) 
	{
		char ch[]=str.toCharArray();
		String w1="";
		for (int i = 0; i < ch.length; i++)
		{
			String w2="";
			
			while(i<ch.length&&ch[i]!=' ')
			{
				w2=w2+ch[i];
				i++;
			}
			if(w2.length()>w1.length())
			{
				w1=w2;
			}
			
		}
		return w1;
	}
}
