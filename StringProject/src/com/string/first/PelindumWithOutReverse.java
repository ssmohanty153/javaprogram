package com.string.first;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

public class PelindumWithOutReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String st=sc.nextLine();
		boolean rs=isPelindum(st);
		if(rs)
		{
			System.out.println(st+"  is pelindrum ");
			
		}
		else
		{
			System.out.println(st+"  is not pelindrum number");
			
		}
	}	
	static	boolean isPelindum(String st)
		{
			char ch[]=st.toCharArray();
			int i=0,l=ch.length-1;
			while(i<l&&ch[i++]==ch[l--]);
			return i>=l;
	
		}
	}

