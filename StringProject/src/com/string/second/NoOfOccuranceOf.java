package com.string.second;

import java.util.Scanner;

public class NoOfOccuranceOf {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int count[]=new int [128];
		for (int i = 0; i < st.length(); i++)
		{
			char ch=st.charAt(i);
			count[ch]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]!=0)
				System.out.println((char)i+"-->"+count[i]);
		}
	}

}
