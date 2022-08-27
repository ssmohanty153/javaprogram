package com.ssm.recurtation;

import java.util.Scanner;

public class Penidrum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  first element");
		String st=sc.nextLine();
		sc.close();
		boolean rs= isPelidrum(st,0,st.length()-1);
		if(rs)
			System.out.println(st+" is pelindrum");
		else
			System.out.println(st+" not is pelindrum");

	}

	static boolean isPelidrum(String st, int i, int j) 
	{
		if(i>=j)
			return true;
		if(st.charAt(i)!=st.charAt(j))
			return false;
		return isPelidrum(st,i+1,j-1);
	}
}
