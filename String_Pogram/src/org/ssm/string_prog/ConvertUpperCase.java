package org.ssm.string_prog;

import java.util.Scanner;

public class ConvertUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the String");
		String str=sc.nextLine();
		sc.close();
		String uc=upperCase(str);
		System.out.println(uc);
	}
	static String upperCase(String str) 
	{
		char ch[]=str.toCharArray();
	
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);

			}
		
			
		}

		String s=new String(ch);


		return s;
	}
}
