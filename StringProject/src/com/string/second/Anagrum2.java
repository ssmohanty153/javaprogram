package com.string.second;

import java.util.Scanner;

public class Anagrum2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the strinh s1: ");
			String s1=sc.nextLine();
			System.out.println("Enter the strinh s2: ");
			String s2=sc.nextLine();
			boolean s=isAnagram(s1,s2);
			if(s)
				System.out.println("String is anagram");
			else
				System.out.println("String is no anagram");

}
		static boolean isAnagram(String s1,String s2) {
			
			
			int c1[]=countOccourance(s1);
			
			int c2[]=countOccourance(s2);
			for (int i = 0; i < c2.length; i++)
			{
				if(c1[i]!=c2[i])
					return false;
			}
			return true;
		}
		
		static int [] countOccourance(String a) {
			
		{
			int c[]=new int[26];
			
			for (int i = 0; i < a.length(); i++) 
			{
				char ch=a.charAt(i);
				if(ch>65&&ch<=90)
			    c[ch-65]++;
				else if (ch>=97&&ch<=122)
					c[ch-97]++;
				}
				return c; 
			}
		}
}
		
		
