package org.ssm.string;

import java.util.Scanner;

public class ReverseTheWord 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=reverseStr(str);
		System.out.println(str2);

	}

	static String reverseStr(String str)
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{

				str=str+ch[j];
				j--;
			}
			if(i<ch.length)
			{
				str=str+ch[i];
			}
		}

		return str;
	}

}
