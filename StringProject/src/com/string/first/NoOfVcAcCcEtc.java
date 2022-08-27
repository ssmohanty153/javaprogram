package com.string.first;

import java.util.Scanner;

public class NoOfVcAcCcEtc {
	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	System.out.println("enter the String: ");
	String str=sca.nextLine();
	int vc=0,cc=0,uc=0,lc=0,sc=0,dc=0;
	for (int i = 0; i < str.length(); i++)
		
	{
		
		char ch=str.charAt(i);
		    if(ch>='A'&&ch<'Z')
		{
			uc++;
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vc++;
			else 
				cc++;
			
			
		}
		else if(ch>='a'&&ch<='z')
		{
			lc++;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vc++;
			else
				cc++;
		
			
		}
		else if(ch>='0'&&ch<='9')
			dc++;
		else
			sc++;
}
	System.out.println("number of vowel :"+vc);
	System.out.println("number of consulants :"+cc);
	System.out.println("number of digit :"+dc);
	System.out.println("number of spicialCharacter :"+sc);
	System.out.println("number of lowerCase :"+lc);
	System.out.println("number of UpperCase :"+uc);
	}

}
