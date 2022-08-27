package com.string.first;

import java.util.Scanner;


public class HowManyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		
		int count=0;
		
			for ( int i = 0; i < ch.length; i++)
		{
			int c=0;
			while(i<ch.length&&ch[i]>='0'&&ch[i]<='9')
			{
				c++;
			i++;
			}
			if(c>0)
			count++;
			}
     		System.out.println(count);
		}
}