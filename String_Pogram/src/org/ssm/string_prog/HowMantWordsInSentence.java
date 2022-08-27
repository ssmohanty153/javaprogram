package org.ssm.string_prog;

import java.util.Scanner;

public class HowMantWordsInSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		sc.close();
		int c=countwords(st);
		System.out.println("number of words are "+c);
	}
	static int countwords(String st)
	{
		char ch[]=st.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				count++;	
			}
		}
		return count;
	}
}
