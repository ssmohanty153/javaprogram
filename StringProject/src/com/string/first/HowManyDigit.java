package com.string.first;

import java.util.Scanner;

public class HowManyDigit {
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the String :");
			String st=sc.nextLine();
			char ch[]=st.toCharArray();
			int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				count++;
			}
		}
			
		System.out.println("Total no of Digit In a String is :"+count);	
		}

	}



