package org.ssm.string_prog;

import java.util.Scanner;

public class WriteNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println(" Enter the number ");
		String str=sc.nextLine();
		sc.close();
		char ch[]=str.toCharArray();
		int i=0;
		int up=0;
		int low=0;
		while(i<ch.length&&ch[i]!='-')
		{
			low=low*10+(ch[i]-48);
			i++;
		}
		while(i<ch.length&&ch[i]!=',')
		{
			up=up*10+(ch[i]-48);
			i++;
		}
		while(low<=up)
		{
			System.out.println(low++);
		}
		i++;
	}
}
