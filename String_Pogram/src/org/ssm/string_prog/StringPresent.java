package org.ssm.string_prog;

import java.util.Scanner;

public class StringPresent 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		sc.close();
		boolean sen=checkString(str1,str2);
		if(sen)
		{
			System.out.println("String is present");
		}
		else
		{
			System.out.println("String i8s not present");
		}
	}
	static boolean checkString(String str1,String str2) 
	{
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		int i=0,j=0;
		while(i<ch1.length)
		{
			int k=i;
			j=0;
			while(k<ch1.length&&j<ch2.length&&ch1[k]==ch2[j])
			{
				k++;
				j++;
			}
			if(j==ch2.length)
				return true;
			i++;
		}
		return false;
	}
}
