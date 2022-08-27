package org.ssm.string;

import java.util.Scanner;

public class ConvertUppercase 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		String st=reverseStri(str);
		System.out.println(st);

	}
	static String reverseStri(String str) 
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
		String s=new String(ch);

		return s;

	}

}
