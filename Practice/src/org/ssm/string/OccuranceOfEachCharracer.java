package org.ssm.string;

import java.util.Scanner;

public class OccuranceOfEachCharracer 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		
		
		int count[]=new int[128];
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			count[ch]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]>=1)
			{
				System.out.print((char)i);
			}
		}





	}

}
