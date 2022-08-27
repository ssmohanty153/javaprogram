package com.string.first;

import java.util.Scanner;

public class WriteInBetween {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int i=0;
		while(i<ch.length)
		{
	    int low=0;
		while(i<ch.length&&ch[i]!='.')
		{
			low = low*10+(ch[i]-48);
			i++;
		}
		i=i+2;
		int up=0;
		while(i<ch.length && ch[i]!=',')
		{
			up=up*10+(ch[i]-48);
			i++;
		}
		while (low<=up)
		{
			System.out.println(low++);
		}
		i++;
	}
  }
}
