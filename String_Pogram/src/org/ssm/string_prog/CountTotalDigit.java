package org.ssm.string_prog;
import java.util.Scanner;
public class CountTotalDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the String");
		String str=sc.nextLine();
		sc.close();
		int j=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				j++;
			}
		}
		System.out.println(str+" is "+j+" no of integer present");
	}
} 