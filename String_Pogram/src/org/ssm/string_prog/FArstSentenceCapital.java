package org.ssm.string_prog;

import java.util.Scanner;

public class FArstSentenceCapital 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		sc.close();
		String sant=initCap(st);
		System.out.println(sant);

	}

	static String initCap(String old)
	{
		char ch[]=old.toCharArray();
		String newest=" ";

		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
				
			}
//			else if(ch[i]>='A'&&ch[i]<='Z')
//			{
//				ch[i]=(char)(ch[i]+32);
//			}
			newest=newest+ch[i];
		}

		return newest;
	}
}
